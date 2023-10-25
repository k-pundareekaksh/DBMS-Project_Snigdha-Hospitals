package com.Snigdha.Snigdha.controller;


import com.Snigdha.Snigdha.dao.DoctorRepository;
import com.Snigdha.Snigdha.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;


    // @GetMapping(path = "/doctors")
    // public List<Doctor> getDoctors(Model model){
    //     doctorRepository.createDoctorTable();
    //     List<Doctor> doctors =  doctorRepository.showAllDoctors();
    //     model.addAttribute("doctors",doctors);
    //     return doctors;
    // }

    @GetMapping(path = "/doctors") //url path
    public String getDoctors(Model model){
        doctorRepository.createDoctorTable();
        model.addAttribute(/*object used in html page*/"doctors",doctorRepository.showAllDoctors());
        return "doctors"; // html page
    }

    @RequestMapping(value = "/adddoctor",method=RequestMethod.GET)
    public String addDoctors(Model model){
        return "adddoctor";
    }

    @RequestMapping(value = "/adddoctor",method = RequestMethod.POST)
    public String addDoctor(Doctor doctor){
        doctorRepository.createDoctor(doctor);
        return "success";
    }
}