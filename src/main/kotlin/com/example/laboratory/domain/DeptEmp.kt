package com.example.laboratory.domain

import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Index
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.MapsId
import javax.persistence.Table

@Entity
@Table(
    name = "dept_emp", indexes = [
        Index(name = "dept_no", columnList = "dept_no")
    ]
)
class DeptEmp {
    @EmbeddedId
    var id: DeptEmpId? = null

    @MapsId("empNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "emp_no", nullable = false)
    var empNo: Employee? = null

    @Column(name = "from_date", nullable = false)
    var fromDate: LocalDate? = null

    @Column(name = "to_date", nullable = false)
    var toDate: LocalDate? = null
}
