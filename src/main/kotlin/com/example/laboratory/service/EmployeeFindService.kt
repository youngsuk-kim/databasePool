package com.example.laboratory.service

import com.example.laboratory.domain.Employee
import com.example.laboratory.repository.EmployeeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
class EmployeeFindService(
    private val employeeRepository: EmployeeRepository
) {
    fun findAllEmployee(): List<Employee> {
        return employeeRepository.findAll()
    }
}
