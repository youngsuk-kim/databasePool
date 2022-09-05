package com.example.laboratory.repository

import com.example.laboratory.domain.Employee
import com.example.laboratory.enums.Gender
import org.slf4j.LoggerFactory
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class JdbcEmployeeRepository(
    val jdbcTemplate: JdbcTemplate
): EmployeeRepository {
    private val log = LoggerFactory.getLogger("JdbcEmployeeRepository")

    val mapper = RowMapper<Employee> { rs: ResultSet, rowNum: Int ->
        Employee(
            rs.getInt("emp_no"),
            rs.getString("first_name"),
            rs.getString("last_name"),
            Gender.valueOf(rs.getString("gender")),
            rs.getDate("hire_date").toLocalDate(),
            rs.getDate("birth_date").toLocalDate(),
            rs.getString("evaluation_text")
        )
    }

    override fun findAll(): List<Employee> {
        val sql = "select emp_no, first_name, last_name, gender, hire_date from employees limit 5"
        return jdbcTemplate.query(sql, mapper)
    }

    override fun findById(id: Int): Employee? {
        TODO("Not yet implemented")
    }

    override fun save(employee: Employee): Employee {
        TODO("Not yet implemented")
    }
}
