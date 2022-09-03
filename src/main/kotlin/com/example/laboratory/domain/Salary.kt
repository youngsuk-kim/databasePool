package com.example.laboratory.domain

import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.MapsId
import javax.persistence.Table

@Entity
@Table(name = "salaries")
 class Salary {
    @EmbeddedId
     var id: SalaryId? = null

    @MapsId("empNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "emp_no", nullable = false)
     var empNo: Employee? = null

    @Column(name = "salary", nullable = false)
     var salary: Int? = null

    @Column(name = "to_date", nullable = false)
     var toDate: LocalDate? = null
}
