package com.practice.web.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Entity
@Table(name = "Employees")
public class EmployeeEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double salary;
    private String email;
    private Integer age;
    private LocalDate joinDate;
    private Boolean active;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, Integer id, Double salary, String email, Integer age, LocalDate joinDate, Boolean active) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.email = email;
        this.age = age;
        this.joinDate = joinDate;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", joinDate=" + joinDate +
                ", active=" + active +
                '}';
    }
}
