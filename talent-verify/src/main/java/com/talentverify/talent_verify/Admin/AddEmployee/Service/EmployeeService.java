package com.talentverify.talent_verify.Admin.AddEmployee.Service;

import com.talentverify.talent_verify.Admin.AddEmployee.Employee;
import com.talentverify.talent_verify.Admin.AddEmployee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    //for adding a single employee
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void AddEmployee(Employee employee) {
        Optional<Employee> employeeOptional = Optional.ofNullable(employeeRepository.findEmployeeByEmail(employee.getEmail()));

        if (employeeOptional.isPresent()){
            System.out.println("Employee Already Exists");
        }
        else {
            employeeRepository.save(employee);

        }
    }

    public Employee getEmployee(String email, String companyemail) throws EmployeeNotFoundException {
        Optional<Employee> employee = Optional.ofNullable(employeeRepository.findEmployeeByEmail(email));

        if (employee.isPresent() && employee.get().getCompanyemail().equals(companyemail)) {
            return employee.get();
        } else if (employee.isPresent()) {
            try {
                throw new AccessDeniedException("You are not authorized to view this employee's details.");
            } catch (AccessDeniedException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new EmployeeNotFoundException("Employee not found with email: " + email);
        }
    }
    @Transactional
    public void update(String email, Employee Updatedemployee) {
        Optional<Employee> employeeOptional = Optional.ofNullable(employeeRepository.findEmployeeByEmail(email));


        if (employeeOptional.isPresent()){
            Employee emp = employeeRepository.findEmployeeByEmail(email);

            // setting the filed
            emp.setName(Updatedemployee.getName());
            emp.setEmail(Updatedemployee.getEmail());
            emp.setRoles(Updatedemployee.getRoles());
            emp.setTel(Updatedemployee.getTel());
            emp.setEndDate(Updatedemployee.getEndDate());
            emp.setStartDate(Updatedemployee.getStartDate());
            emp.setDepartment(Updatedemployee.getDepartment());
            emp.setSurname(Updatedemployee.getSurname());
        }

    }
}
