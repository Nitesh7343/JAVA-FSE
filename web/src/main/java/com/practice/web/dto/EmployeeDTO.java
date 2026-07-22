package com.practice.web.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private int ID;
    private String name;
    private double salary;
    private String email;
    private int age;
    private LocalDate joinDate;
    private boolean isActive;

    public EmployeeDTO(int ID, String name, double salary, String email, int age, LocalDate joinDate, boolean isActive) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.age = age;
        this.joinDate = joinDate;
        this.isActive = isActive;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", joinDate=" + joinDate +
                ", isActive=" + isActive +
                '}';
    }
}
