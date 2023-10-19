package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.AppointmentRepository;
import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;

public class AppointmentController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping("/addappointment")
    public String addAppointment(Appointment appointment){
        String sql_query = "INSERT INTO appointment (pid,did,illness,date,mode) VALUES (?,?,?,?,?)";
        jdbcTemplate. update(sql_query,
                appointment.getPatientId(),
                appointment.getDoctorId(),
                appointment.getPatientIllness(),
                appointment.getDateOfAppointment(),
                appointment.getModeOfAppointment()
        );
        return "success";
    }


}
