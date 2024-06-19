package com.talentverify.talent_verify.Admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin{
        @Id
        private Long id;
        String CompanyName;
        String RegistrationDate;
        String Address;
        String phoneNumber;
        String CompanyEmail;
        String Departments;
        int numberOfEmployees;
        String password;

        public Admin(Long id, String companyName, String registrationDate,
                     String address, String phoneNumber,
                     String companyEmail, String departments, int numberOfEmployees,
                     String password) {
                this.id = id;
                CompanyName = companyName;
                RegistrationDate = registrationDate;
                Address = address;
                this.phoneNumber = phoneNumber;
                CompanyEmail = companyEmail;
                Departments = departments;
                this.numberOfEmployees = numberOfEmployees;
                this.password = password;
        }

        public Admin() {

        }

        public Admin(String companyName, String registrationDate, String address,
                     String phoneNumber, String companyEmail, String departments,
                     int numberOfEmployees, String password) {
                CompanyName = companyName;
                RegistrationDate = registrationDate;
                Address = address;
                this.phoneNumber = phoneNumber;
                CompanyEmail = companyEmail;
                Departments = departments;
                this.numberOfEmployees = numberOfEmployees;
                this.password = password;
        }

        public String getCompanyName() {
                return CompanyName;
        }

        public void setCompanyName(String companyName) {
                CompanyName = companyName;
        }

        public String getRegistrationDate() {
                return RegistrationDate;
        }

        public void setRegistrationDate(String registrationDate) {
                RegistrationDate = registrationDate;
        }

        public String getAddress() {
                return Address;
        }

        public void setAddress(String address) {
                Address = address;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getCompanyEmail() {
                return CompanyEmail;
        }

        public void setCompanyEmail(String companyEmail) {
                CompanyEmail = companyEmail;
        }

        public String getDepartments() {
                return Departments;
        }

        public void setDepartments(String departments) {
                Departments = departments;
        }

        public int getNumberOfEmployees() {
                return numberOfEmployees;
        }

        public void setNumberOfEmployees(int numberOfEmployees) {
                this.numberOfEmployees = numberOfEmployees;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }




        public void setId(Long id) {
                this.id = id;
        }

        public Long getId() {
                return id;
        }

        @Override
        public String toString() {
                return "Admin{" +
                        "id=" + id +
                        ", CompanyName='" + CompanyName + '\'' +
                        ", RegistrationDate='" + RegistrationDate + '\'' +
                        ", Address='" + Address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", CompanyEmail='" + CompanyEmail + '\'' +
                        ", Departments='" + Departments + '\'' +
                        ", numberOfEmployees=" + numberOfEmployees +
                        ", password='" + password + '\'' +
                        '}';
        }
}