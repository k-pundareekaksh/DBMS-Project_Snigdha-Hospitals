package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.AppointmentRepository;
import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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


}
