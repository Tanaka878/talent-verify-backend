package com.talentverify.talent_verify.Admin.Service;

import com.talentverify.talent_verify.Admin.Admin;
import com.talentverify.talent_verify.Admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    public Admin Retrieve(String companyemail) {
        return adminRepository.findByCompanyemail(companyemail);
    }

    public void addAdminstrator(Admin admin) {
        adminRepository.save(admin);
    }
}
