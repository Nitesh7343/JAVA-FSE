package com.practice.web.dto;

import lombok.*;

import java.time.LocalDate;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

public class EmployeeDTO {
    private Integer id;
    private String name;
    private Double salary;
    private String email;
    private Integer age;
    private LocalDate joinDate;
    private Boolean active;

    public EmployeeDTO() {

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

    public Integer getAge() {

        return age;

    }

    public void setAge(Integer age) {

        this.age = age;

    }

    public LocalDate getJoinDate() {

        return joinDate;

    }

    public void setJoinDate(LocalDate joinDate) {

        this.joinDate = joinDate;

    }

    public Boolean getActive() {

        return active;

    }

    public void setActive(Boolean active) {

        this.active = active;

    }

    @Override

    public String toString() {

        return "EmployeeDTO{" +

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
