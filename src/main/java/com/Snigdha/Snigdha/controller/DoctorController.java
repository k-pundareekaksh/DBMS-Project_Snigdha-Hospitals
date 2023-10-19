package com.Snigdha.Snigdha.controller;


import com.Snigdha.Snigdha.dao.DoctorRepository;
import com.Snigdha.Snigdha.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    public String getDoctors(Model model){
        List<Doctor> doctors = doctorRepository.projectDoctors();
        model.addAttribute("doctors",doctors);
        return "doctors";
    }


}