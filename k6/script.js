import http from 'k6/http';
import { sleep, check } from 'k6';

//Base Url for the test
export const BASE_URL = 'http://127.0.0.1:8080';

export const options = {
    thresholds: {
        http_req_failed: ['rate<0.01'], // http errors should be less than 1%
        http_req_duration: ['p(95)<1000'], // 95% of requests should be below 250ms
    },
    stages: [
        { duration: '20m', target: 100000 },   // simulate ramp-up of traffic from 1 to 20 users over 30 seconds.
    ],
};

export default function () {

    const res = http.post(`${BASE_URL}/api/employees`);
    console.log(res.status)

    check(res, { 'status was 200': (r) => r.status == 200 });

    if(res.timings.duration > 250)
        console.log('The response is longer than expected - Response time was ' + String(res.timings.duration) + ' ms');

    sleep(1);
}
