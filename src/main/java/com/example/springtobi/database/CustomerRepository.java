package com.example.springtobi.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // thanks Java 8, look the custom RowMapper
    public List<Jobs> findAll() {

        List<Jobs> result = jdbcTemplate.query(
                "SELECT job_id, job_title, max_salary, min_salary FROM jobs",
                (rs, rowNum) -> new Jobs(rs.getString("job_id"),
                        rs.getString("job_title"), rs.getInt("min_salary"), rs.getInt("max_salary"))
        );

        return result;

    }

}
