package com.example.laboratory.repository

import com.example.laboratory.domain.Employee
import org.springframework.context.annotation.Primary
import org.springframework.data.repository.Repository

@Primary
interface JpaEmployeeRepository: EmployeeRepository, Repository<Employee, Int> {

    override fun findById(id : Int): Employee?
    override fun findAll(): List<Employee>
}
