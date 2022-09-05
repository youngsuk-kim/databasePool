package com.example.laboratory.api

import com.example.laboratory.domain.Employee
import com.example.laboratory.service.EmployeeFindService
import com.example.laboratory.service.EmployeeSaveService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeApi(
    private val findService: EmployeeFindService,
    private val employeeSaveService: EmployeeSaveService
) {
    @GetMapping("/api/employees")
    fun getAll(): List<Employee> {
        return findService.findAllEmployee()
    }

    @GetMapping("/api/hello")
    fun hello(): String {
        return "hello"
    }

    @PostMapping("/api/employees")
    fun save() {
        return employeeSaveService.save()
    }
}
