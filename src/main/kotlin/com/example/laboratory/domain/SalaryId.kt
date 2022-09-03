package com.example.laboratory.domain

import org.hibernate.Hibernate
import java.io.Serializable
import java.time.LocalDate
import java.util.Objects
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
 class SalaryId : Serializable {
    @Column(name = "emp_no", nullable = false)
     var empNo: Int? = null

    @Column(name = "from_date", nullable = false)
     var fromDate: LocalDate? = null

    override fun hashCode(): Int = Objects.hash(empNo, fromDate)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false

        other as SalaryId

        return empNo == other.empNo &&
                fromDate == other.fromDate
    }

    companion object {
        private const val serialVersionUID = 4194219465732360756L
    }
}
