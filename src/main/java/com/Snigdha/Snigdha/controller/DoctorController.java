package com.Snigdha.Snigdha.controller;


import com.Snigdha.Snigdha.dao.DoctorRepository;
import com.Snigdha.Snigdha.models.Doctor;
import com.Snigdha.Snigdha.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService){
        this.doctorService = doctorService;
    }

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    public String getDoctors(Model model){
        Doctor[] doctors = doctorService.getDoctors();
        model.addAttribute("doctors",doctors);
        return "doctors";
    }


}