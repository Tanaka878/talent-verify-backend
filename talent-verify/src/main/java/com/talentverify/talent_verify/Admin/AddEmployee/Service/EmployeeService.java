package com.talentverify.talent_verify.Admin.AddEmployee.Service;

import com.talentverify.talent_verify.Admin.AddEmployee.Employee;
import com.talentverify.talent_verify.Admin.AddEmployee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

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
    public void update(Long id, String surname, LocalDate startDate,
                       LocalDate endDate, String tel, String department, String roles, String name) {
        Employee employee = employeeRepository.findEmployeeById(id);
        employee.setSurname(surname);
        employee.setDepartment(department);
        employee.setName(name);
        employee.setStartDate(startDate);
        employee.setEndDate(endDate);
        employee.setTel(tel);
        employee.setRoles(roles);


    }
}
