package com.api.vagas_emprego.View.Controller;

import com.api.vagas_emprego.Service.CompanyService;
import com.api.vagas_emprego.Service.VacancyService;
import com.api.vagas_emprego.Shared.CompanyDto;
import com.api.vagas_emprego.View.Model.CompanyResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work/v1/company")
public class CompanyController {

    
    @Autowired
    CompanyService companyService;

    @Autowired
    VacancyService vacancyService;

    @GetMapping("/{id}")
    public ResponseEntity<?> consult(@PathVariable Long id){


        CompanyResponse response = companyService.byId(id);

        return ResponseEntity.ok().body(response);

    }
    

    @PostMapping
    public ResponseEntity<?> registerCompany(@RequestBody CompanyDto companyDto){

        CompanyResponse response = companyService.register(companyDto);

        return ResponseEntity.ok().body(response);

    }


   
    

    

}
