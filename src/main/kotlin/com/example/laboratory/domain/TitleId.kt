package com.example.laboratory.domain

import org.hibernate.Hibernate
import java.io.Serializable
import java.time.LocalDate
import java.util.Objects
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
 class TitleId : Serializable {
    @Column(name = "emp_no", nullable = false)
     var empNo: Int? = null

    @Column(name = "title", nullable = false, length = 50)
     var title: String? = null

    @Column(name = "from_date", nullable = false)
     var fromDate: LocalDate? = null

    override fun hashCode(): Int = Objects.hash(empNo, title, fromDate)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false

        other as TitleId

        return empNo == other.empNo &&
                title == other.title &&
                fromDate == other.fromDate
    }

    companion object {
        private const val serialVersionUID = 8630977640366231909L
    }
}
