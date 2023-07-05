package model;

import java.sql.Date;
import java.time.LocalDate;

public class Student {
    private int id;
    private  String name;
    private String email;
    private LocalDate DateofBirth;
    private String address;
    private String phoneNumber;
    private int classroom;

    public Student() {
    }

    public Student( String name, String email, LocalDate dateofBirth, String address, String phoneNumber, int classroom) {

        this.name = name;
        this.email = email;
        DateofBirth = dateofBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.classroom = classroom;
    }

    public Student(int id, String name, String email, LocalDate dateofBirth, String address, String phoneNumber, int classroom) {
        this.id = id;
        this.name = name;
        this.email = email;
        DateofBirth = dateofBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
}
