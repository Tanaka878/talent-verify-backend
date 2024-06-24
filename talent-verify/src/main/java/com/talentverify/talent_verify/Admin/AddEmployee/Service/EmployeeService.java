package com.talentverify.talent_verify.Admin.AddEmployee.Service;

import com.talentverify.talent_verify.Admin.AddEmployee.Employee;
import com.talentverify.talent_verify.Admin.AddEmployee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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
        employeeRepository.save(employee);
    }

    public Employee getEmployee(String email) {
       return employeeRepository.findEmployeeByEmail(email);

    }


    @Transactional
    public void update(String email, Employee Updatedemployee) {
        Optional<Employee> employeeOptional = Optional.ofNullable(employeeRepository.findEmployeeByEmail(email));


        if (employeeOptional.isPresent()){
            Employee emp = employeeRepository.findEmployeeByEmail(email);

            // setting the fileds
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
