package com.example.laboratory.service

import com.example.laboratory.domain.Employee
import com.example.laboratory.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeFindService(
    private val employeeRepository: EmployeeRepository
) {
    fun findAllEmployee(): List<Employee> {
        return employeeRepository.findAll()
    }
}
