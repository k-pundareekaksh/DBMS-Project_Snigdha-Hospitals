package com.Snigdha.Snigdha.dao;

import com.Snigdha.Snigdha.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class DoctorRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Doctor>  projectDoctors(){
        String sql_query = "SELECT * FROM doctors";
        return jdbcTemplate.query(sql_query,new BeanPropertyRowMapper<>(Doctor.class));
    }

    public void createDoctor(Doctor doctor){
        String sql_query = "INSERT INTO doctor (id,name,qualification,department,fees,phone) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql_query,
                doctor.getDoctorId(),
                doctor.getDoctorName(),
                doctor.getDoctorQualification(),
                doctor.getDoctorDepartment(),
                doctor.getDoctorFees(),
                doctor.getDoctorPhone()
        );
    }

    public void deleteDoctor(int doctorId){
        String sql_query = "DELETE FROM doctor WHERE id = ?";
        jdbcTemplate.update(sql_query,doctorId);

    }

}
