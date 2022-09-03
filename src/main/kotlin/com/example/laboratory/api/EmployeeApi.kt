package com.example.laboratory.api

import com.example.laboratory.domain.Employee
import com.example.laboratory.service.EmployeeFindService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeApi(
    private val findService: EmployeeFindService
) {
    @GetMapping("/api/employees")
    fun getAll(): List<Employee> {
        return findService.findAllEmployee()
    }

    @GetMapping("/api/hello")
    fun hello(): String {
        return "hello"
    }
}
