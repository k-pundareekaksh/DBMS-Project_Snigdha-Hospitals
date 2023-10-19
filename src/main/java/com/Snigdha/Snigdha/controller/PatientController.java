package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;


    @GetMapping("/patients")
    public String getPatients(){
        return "patients";
    }

}
