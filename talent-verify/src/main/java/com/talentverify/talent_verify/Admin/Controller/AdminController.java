package com.talentverify.talent_verify.Admin.Controller;

import com.talentverify.talent_verify.Admin.Admin;
import com.talentverify.talent_verify.Admin.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {

    private final AdminService service;

    @Autowired
    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping(path = "{companyemail}")
    public Admin getAdmin(@PathVariable("companyemail") String companyemail){
        return service.Retrieve(companyemail);

    }

    @PostMapping(path = "/register-company")
    public void addAdmin(@RequestBody Admin admin){
        service.addAdminstrator(admin);

    }
}
