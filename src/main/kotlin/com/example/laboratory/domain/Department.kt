package com.example.laboratory.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Index
import javax.persistence.Table

@Entity
@Table(
    name = "departments", indexes = [
        Index(name = "dept_name", columnList = "dept_name", unique = true)
    ]
)
class Department {
    @Id
    @Column(name = "dept_no", nullable = false, length = 4)
    var id: String? = null

    @Column(name = "dept_name", nullable = false, length = 40)
    var deptName: String? = null
}
