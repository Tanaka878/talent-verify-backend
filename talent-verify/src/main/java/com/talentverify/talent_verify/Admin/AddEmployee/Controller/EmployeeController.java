package com.talentverify.talent_verify.Admin.AddEmployee.Controller;

import com.talentverify.talent_verify.Admin.AddEmployee.Employee;
import com.talentverify.talent_verify.Admin.AddEmployee.Service.EmployeeNotFoundException;
import com.talentverify.talent_verify.Admin.AddEmployee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/single-upload")
    public void InsertEmployees(@RequestBody Employee employee){
        employeeService.AddEmployee(employee);
    }

    @PostMapping("/bulk-upload")
    public void AddCsv(){}

    @GetMapping("/getEmployees/{mail}/{companyemail}")
    public Employee getEmployee(@PathVariable("mail") String mail, @PathVariable("companyemail") String companyemail) throws EmployeeNotFoundException {
        System.out.println("Request Received Successfully: " + mail + ", " + companyemail);
        return employeeService.getEmployee(mail, companyemail);
    }
    @PutMapping("/update/{email}")
    public void UpdateDetails(@PathVariable("email") String email, @RequestBody Employee employee
                              ){
        employeeService.update(email, employee);
    }
    


}
