package com.talentverify.talent_verify.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository  extends JpaRepository<Admin,Long> {
    Admin findAdminByCompanyEmail(String companyEmail);

}
