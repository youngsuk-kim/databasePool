package com.example.laboratory.service

import com.example.laboratory.domain.Employee
import com.example.laboratory.enums.Gender
import com.example.laboratory.repository.EmployeeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.time.Instant
import java.time.LocalDate
import java.util.Date

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
class EmployeeSaveService(
    private val employeeRepository: EmployeeRepository
) {
    fun save() {
        employeeRepository.save(
            Employee(
                firstName = "youngsuk",
                lastName = "kim",
                gender = Gender.M,
                hireDate = LocalDate.now(),
                birthDate = LocalDate.now(),
                evaluationText = "평가"
            )
        )
    }
}
