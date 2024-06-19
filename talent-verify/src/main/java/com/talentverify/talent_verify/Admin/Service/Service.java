package com.talentverify.talent_verify.Admin.Service;

import com.talentverify.talent_verify.Admin.Admin;
import com.talentverify.talent_verify.Admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    private final AdminRepository adminRepository;

    @Autowired
    public Service(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    public Admin Retrieve(String companyEmail) {
        return adminRepository.findAdminByCompanyEmail(companyEmail);
    }
}
