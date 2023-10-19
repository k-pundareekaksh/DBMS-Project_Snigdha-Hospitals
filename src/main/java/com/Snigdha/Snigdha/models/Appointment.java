package com.Snigdha.Snigdha.models;

import java.util.Date;

public class Appointment {

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientIllness() {
        return patientIllness;
    }

    public void setPatientIllness(int patientIllness) {
        this.patientIllness = patientIllness;
    }

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getModeOfAppointment() {
        return modeOfAppointment;
    }

    public void setModeOfAppointment(String modeOfAppointment) {
        this.modeOfAppointment = modeOfAppointment;
    }

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private int patientIllness;
    private Date dateOfAppointment;
    private String modeOfAppointment;
}