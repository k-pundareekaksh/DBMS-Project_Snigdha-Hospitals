package com.Snigdha.Snigdha.controller;


import com.Snigdha.Snigdha.dao.DoctorRepository;
import com.Snigdha.Snigdha.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DoctorController {

@Autowired
private DoctorRepository doctorRepository;


    @GetMapping("/doctors")
    public String getDoctors(Model model){
////        Doctor[] doctors = doctorService.getDoctors();
//        Doctor[] doctors = {new Doctor(1,"Vignesh","MD","Ortho",300,94449494)};
//        model.addAttribute("doctors",doctors);
        return "doctors";
    }

    @GetMapping("/adddoctor")
    public String addDoctors(){
        return "adddoctor";
    }

    @PostMapping("/adddoctors")
    public String addDoctor(Doctor doctor){
        doctorRepository.createDoctor(doctor);
        return "success";
    }


}