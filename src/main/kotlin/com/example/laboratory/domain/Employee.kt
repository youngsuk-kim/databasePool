package com.example.laboratory.domain

import com.example.laboratory.enums.Gender
import org.springframework.data.domain.Persistable
import java.time.LocalDate
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.PostLoad
import javax.persistence.PrePersist
import javax.persistence.Table
import javax.persistence.Transient

@Entity
@Table(name = "employees")
class Employee(
    empId: Int? = null,
    firstName: String,
    lastName: String,
    gender: Gender,
    hireDate: LocalDate,
    birthDate: LocalDate,
    evaluationText: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_no", nullable = false)
    var empId: Int? = empId

    @Column(name = "birth_date", nullable = false)
    var birthDate: LocalDate? = birthDate

    @Column(name = "first_name", nullable = false, length = 14)
    var firstName: String? = firstName

    @Column(name = "last_name", nullable = false, length = 16)
    var lastName: String? = lastName

    @Lob
    @Column(name = "gender", nullable = false)
    var gender: String? = gender.toString()

    @Column(name = "hire_date", nullable = false)
    var hireDate: LocalDate? = hireDate

    @Column(columnDefinition = "TEXT")
    var evaluationText: String = evaluationText
}
