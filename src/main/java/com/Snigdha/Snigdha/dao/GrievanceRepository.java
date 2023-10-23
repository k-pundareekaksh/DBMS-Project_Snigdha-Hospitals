package com.Snigdha.Snigdha.dao;

import com.Snigdha.Snigdha.models.Grievance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class GrievanceRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Grievance> projectGrievance(){
        String sql_query = "SELECT * FROM grievance";
        return jdbcTemplate.query(sql_query, new BeanPropertyRowMapper<>(Grievance.class));
    }



    public void createGrievance(Grievance grievance){
        String sql_query = "INSERT INTO grievance (grievance_ovrl,grievance_topic,grievance_remarks,grievance_pid) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql_query,
                grievance.getGrievance_Ovrl(),
                grievance.getGrievance_Topic(),
                grievance.getGrievance_Remarks(),
                grievance.getGrievance_Pid()
        );
    }
}
