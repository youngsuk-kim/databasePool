package com.example.laboratory.domain

import com.example.laboratory.enums.Gender
import java.time.LocalDate
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

@Entity
@Table(name = "employees")
class Employee(
    id: Int,
    firstName: String,
    lastName: String,
    gender: Gender,
    hireDate: Date
) {
    @Id
    @Column(name = "emp_no", nullable = false)
    var id: Int? = id

    @Column(name = "birth_date", nullable = false)
    var birthDate: LocalDate? = null

    @Column(name = "first_name", nullable = false, length = 14)
    var firstName: String? = null

    @Column(name = "last_name", nullable = false, length = 16)
    var lastName: String? = null

    @Lob
    @Column(name = "gender", nullable = false)
    var gender: String? = null

    @Column(name = "hire_date", nullable = false)
    var hireDate: Date? = null
}
