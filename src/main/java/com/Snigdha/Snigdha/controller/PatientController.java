package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.PatientRepository;
import com.Snigdha.Snigdha.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private PatientRepository patientRepository;


    @GetMapping("/patients")
    public String getPatients(){
        return "patients";
    }

    @PostMapping("/addpatient")
    public String addPatient(Patient patient){
        String sql_query = "INSERT INTO patient (name,dob,blood,phone) VALUES (?,?,?,?)";
        jdbcTemplate. update(sql_query,
                patient.getPatientName(),
                patient.getPatientDob(),
                patient.getPatientPhone()
        );
        return "success";
    }

}
