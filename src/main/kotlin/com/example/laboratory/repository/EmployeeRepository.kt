package com.example.laboratory.repository

import com.example.laboratory.domain.Employee

interface EmployeeRepository {
    fun findAll(): List<Employee>
    fun findById(id: Int): Employee?
    fun save(employee: Employee): Employee
}
