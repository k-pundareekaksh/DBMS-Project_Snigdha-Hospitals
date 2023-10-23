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

    public void createAppointmentTable(){
        String sql_query = "CREATE TABLE appointment (id int AUTO_INCREMENT,pid int,did int,illness varchar(30),doa date,mode char(7), PRIMARY KEY (id), FOREIGN KEY (pid) REFERENCES patient(id),FOREIGN KEY (did) REFERENCES doctor(id))";
        jdbcTemplate.update(sql_query);
    }

    public List<Appointment> projectAppointment(){
        String sql_query = "SELECT * FROM appointment";
        return jdbcTemplate.query(sql_query, new BeanPropertyRowMapper<>(Appointment.class));
    }

    public void createAppointment(Appointment appointment){
        String sql_query = "INSERT INTO appointment (pid,did,illness,doa,mode) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql_query,
                appointment.getAppointmentId(),
                appointment.getPatientId(),
                appointment.getDoctorId(),
                appointment.getDateOfAppointment(),
                appointment.getModeOfAppointment()
        );
    }

    public void cancelAppointment(int appointmentId){
        String sql_query = "DELETE FROM appointment WHERE id =?";
        jdbcTemplate.update(sql_query,appointmentId);
    }

}
