package com.talentverify.talent_verify.Admin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Admin{

        String CompanyName;
        String RegistrationDate;
        String address;
        String phoneNumber;
        String companyemail;
        String departments;
        int numberofemployees;
        String password;
        String confirmpassword;

    @Id
    @GeneratedValue
    private Long id;

        public Admin(String companyName, String registrationDate, String address,
                     String phoneNumber, String companyemail, String departments, int
                numberofemployees, String password, String confirmpassword, Long id) {
                CompanyName = companyName;
                RegistrationDate = registrationDate;
                this.address = address;
                this.phoneNumber = phoneNumber;
                this.companyemail = companyemail;
                this.departments = departments;
                this.numberofemployees = numberofemployees;
                this.password = password;
                this.confirmpassword = confirmpassword;
                this.id = id;
        }

        public Admin(String confirmpassword, String password, int numberofemployees,
                     String companyemail, String departments, String phoneNumber,
                     String address, String registrationDate, String companyName) {
                this.confirmpassword = confirmpassword;
                this.password = password;
                this.numberofemployees = numberofemployees;
                this.companyemail = companyemail;
                this.departments = departments;
                this.phoneNumber = phoneNumber;
                this.address = address;
                RegistrationDate = registrationDate;
                CompanyName = companyName;
        }

        public Admin() {
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
                return this.address;
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

        public String getCompanyemail() {
                return companyemail;
        }

        public void setCompanyemail(String companyemail) {
                this.companyemail = companyemail;
        }

        public String getDepartments() {
                return departments;
        }

        public void setDepartments(String departments) {
                this.departments = departments;
        }

        public int getNumberofemployees() {
                return numberofemployees;
        }

        public void setNumberofemployees(int numberofemployees) {
                this.numberofemployees = numberofemployees;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getConfirmpassword() {
                return confirmpassword;
        }

        public void setConfirmpassword(String confirmpassword) {
                this.confirmpassword = confirmpassword;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        @Override
        public String toString() {
                return "Admin{" +
                        "CompanyName='" + CompanyName + '\'' +
                        ", RegistrationDate='" + RegistrationDate + '\'' +
                        ", address='" + address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", companyemail='" + companyemail + '\'' +
                        ", departments='" + departments + '\'' +
                        ", numberofemployees=" + numberofemployees +
                        ", password='" + password + '\'' +
                        ", confirmpassword='" + confirmpassword + '\'' +
                        ", id=" + id +
                        '}';
        }
}