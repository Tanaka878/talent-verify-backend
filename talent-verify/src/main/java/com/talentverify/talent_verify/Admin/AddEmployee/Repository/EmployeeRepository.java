package com.talentverify.talent_verify.Admin.AddEmployee.Repository;

import com.talentverify.talent_verify.Admin.AddEmployee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
