package com.Snigdha.Snigdha.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Snigdha.Snigdha.models.Doctor;

public class DoctorRowMapper implements RowMapper<Doctor> {

    public Doctor mapRow(ResultSet rs, int rowNumber) throws SQLException {

        Doctor doctor = new Doctor();
        // here we setch the data from mysql
        // attribute names must match with column names in the mysql table

        doctor.setDoctorId(rs.getInt("id"));
        doctor.setDoctorName(rs.getString("doctorname"));
        doctor.setDoctorQualification(rs.getString("qualification"));
        doctor.setDoctorDepartment(rs.getString("department"));
        doctor.setDoctorFees(rs.getInt("fees"));
        doctor.setDoctorPhone(rs.getLong("phone"));

        return doctor;

    }

}
