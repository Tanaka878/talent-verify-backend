package com.talentverify.talent_verify.Admin.Service;

import com.talentverify.talent_verify.Admin.Admin;
import com.talentverify.talent_verify.Admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        Optional<Admin> adminOptional = Optional.ofNullable(adminRepository.findByCompanyemail(admin.getCompanyemail()));
        if (adminOptional.isPresent()){
            System.out.println("Company Already exists");
        }
        else {
            adminRepository.save(admin);
        }

    }
}
