package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.PatientRepository;
import com.Snigdha.Snigdha.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PatientController {

//

    @Autowired
    private PatientRepository patientRepository;


    @GetMapping("/patients")
    public String getPatients(Model model){
        List<Patient> patients =  patientRepository.projectPatients();
        model.addAttribute("patient",patients);
        return "patients";
    }

    @PostMapping("/addpatient")
    public String addPatient(Patient patient){
        patientRepository.createPatient(patient);
        return "success";
    }

}
