package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.AppointmentRepository;
import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppointmentController {


    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/appointments")
    public String getAppointments(Model model){
        appointmentRepository.createAppointmentTable();
        List<Appointment> appointments =  appointmentRepository.projectAppointment();
        model.addAttribute("appointments",appointments);
        return "appointments";
    }

    @RequestMapping(value = "/addappointment",method = RequestMethod.GET)
    public String addAppointmentget(Model model){
        return "addappointment";
    }

    @RequestMapping(value = "/addappointment",method = RequestMethod.POST)
    public String addAppointmentpost(Appointment appointment){
        appointmentRepository.createAppointment(appointment);
        return "success";
    }

}
