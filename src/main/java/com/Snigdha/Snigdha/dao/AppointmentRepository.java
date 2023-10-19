package com.Snigdha.Snigdha.dao;

import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class AppointmentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Appointment> projectAppointment(){
        String sql_query = "SELECT * FROM appointment";
        return jdbcTemplate.query(sql_query, new BeanPropertyRowMapper<>(Appointment.class));
    }

    public void cancelAppointment(int appointmentId){
        String sql_query = "DELETE FROM appointment WHERE id =?";
        jdbcTemplate.update(sql_query,appointmentId);
    }

    public void createAppointment(Appointment appointment){
        String sql_query = "INSERT INTO appointment (id,pid,did,date,mode) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql_query,
                appointment.getAppointmentId(),
                appointment.getPatientId(),
                appointment.getDoctorId(),
                appointment.getDateOfAppointment(),
                appointment.getModeOfAppointment()
        );
    }
}
