package com.talentverify.talent_verify.Admin.AddEmployee.Repository;

import com.talentverify.talent_verify.Admin.AddEmployee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeByEmail(String email);
    Employee findEmployeeByCompanyemailAndAndEmail(String email, String companyemail);

    Employee findEmployeeById(Long id);

}
