package com.Snigdha.Snigdha.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DoctorController {
    @GetMapping("/doctors")
    public String getDoctors(){
        return "doctors";
    }
}