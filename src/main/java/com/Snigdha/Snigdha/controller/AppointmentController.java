package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.AppointmentRepository;
import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class AppointmentController {


    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/appointments")
    public String getDoctors(Model model){
        List<Appointment> appointments =  appointmentRepository.projectAppointment();
        model.addAttribute("appointments",appointments);
        return "appointments";
    }

    @PostMapping("/addappointment")
    public String addAppointment(Appointment appointment){
        appointmentRepository.createAppointment(appointment);
        return "success";
    }

    @GetMapping("/addappointment")
    public String addAppointment(Model model){
        List <Appointment> appointments = appointmentRepository.projectAppointment();
        model.addAttribute("doctor",appointments);
        return "adddoctor";
    }

    @RequestMapping(value = "/addappointment",method = RequestMethod.POST)
    public String addDoctor(Appointment appointment){
        appointmentRepository.createAppointment(appointment);
        return "success";
    }

}
