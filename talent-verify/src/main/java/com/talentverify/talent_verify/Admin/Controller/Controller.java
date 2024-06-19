package com.talentverify.talent_verify.Admin.Controller;

import com.talentverify.talent_verify.Admin.Admin;
import com.talentverify.talent_verify.Admin.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(path = "{companyEmail}")
    public Admin getAdmin(@PathVariable("companyEmail") String companyEmail){
        return service.Retrieve(companyEmail);

    }
}
