package com.talentverify.talent_verify.Admin.AddEmployee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    String name;
    String surname;
    String email;
    LocalDate startDate;
    LocalDate endDate;
    String tel;
    String department;
    String roles;
    String companyemail;

    public Employee(Long id, String email, String name, String surname, String department, String roles,
                    LocalDate startDate, LocalDate endDate, String tel, String companyemail) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.roles = roles;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tel = tel;
        this.companyemail = companyemail;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", tel='" + tel + '\'' +
                ", department='" + department + '\'' +
                ", roles='" + roles + '\'' +
                ", companyemail='" + companyemail + '\'' +
                '}';
    }

    public Employee(String name, String surname, String email, String department, String roles,
                    LocalDate startDate, LocalDate endDate, String tel, String companyemail) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.department = department;
        this.roles = roles;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tel = tel;
        this.companyemail = companyemail;
    }

    public Employee() {
    }

    public String getCompanyemail() {
        return companyemail;
    }

    public void setCompanyemail(String companyemail) {
        this.companyemail = companyemail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
