package com.Snigdha.Snigdha.models;

import java.time.LocalDate;

public class Patient {

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(LocalDate patientDob) {
        this.patientDob = patientDob;
    }

    public String getPatientBlood() {
        return patientBlood;
    }

    public void setPatientBlood(String patientBlood) {
        this.patientBlood = patientBlood;
    }

    public Long getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(Long patientPhone) {
        this.patientPhone = patientPhone;
    }

    private int patientId;
    private String patientName;
    private LocalDate patientDob;
    private String patientBlood;
    private Long patientPhone;

    public Patient(int id,String name,LocalDate dob,String blood,Long phone){
        this.patientId=id;
        this.patientName=name;
        this.patientDob=dob;
        this.patientBlood=blood;
        this.patientPhone=phone;
    }
}
