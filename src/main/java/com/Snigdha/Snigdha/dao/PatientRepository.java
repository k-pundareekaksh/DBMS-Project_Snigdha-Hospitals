package com.Snigdha.Snigdha.dao;

import com.Snigdha.Snigdha.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PatientRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Patient> projectPatients(){
        String sql_query = "SELECT * FROM patients";
        return jdbcTemplate.query(sql_query,new BeanPropertyRowMapper<>(Patient.class));

    }

    public void createPatient(){
        String sql_query = "INSERT INTO patient () VALUES (?,?,?,?,)";
    }

    public void deletePatient(Patient patient){
        String sql_query = "DELETE FROM patient WHERE id = ?";
        jdbcTemplate.update(sql_query,
                patient.getPatientId()
        );
    }

}
