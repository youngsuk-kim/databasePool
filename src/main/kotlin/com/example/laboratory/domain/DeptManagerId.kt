package com.example.laboratory.domain

import org.hibernate.Hibernate
import java.io.Serializable
import java.util.Objects
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
 class DeptManagerId : Serializable {
    @Column(name = "emp_no", nullable = false)
     var empNo: Int? = null

    @Column(name = "dept_no", nullable = false, length = 4)
     var deptNo: String? = null

    override fun hashCode(): Int = Objects.hash(empNo, deptNo)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false

        other as DeptManagerId

        return empNo == other.empNo &&
                deptNo == other.deptNo
    }

    companion object {
        private const val serialVersionUID = -6871674744303052273L
    }
}
