package com.Snigdha.Snigdha.models;

public class Doctor {

    private int doctorId;
    private String doctorName;
    private String doctorQualification;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorQualification() {
        return doctorQualification;
    }

    public void setDoctorQualification(String doctorQualification) {
        this.doctorQualification = doctorQualification;
    }

    public String getDoctorDepartment() {
        return doctorDepartment;
    }

    public void setDoctorDepartment(String doctorDepartment) {
        this.doctorDepartment = doctorDepartment;
    }

    public int getDoctorFees() {
        return doctorFees;
    }

    public void setDoctorFees(int doctorFees) {
        this.doctorFees = doctorFees;
    }

    public long getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(long doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    private String doctorDepartment;
    private int doctorFees;
    private long doctorPhone;

}
