package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.AppointmentRepository;
import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class AppointmentController {


    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping("/addappointment")
    public String addAppointment(Appointment appointment){
        appointmentRepository.createAppointment(appointment);
        return "success";
    }


}
