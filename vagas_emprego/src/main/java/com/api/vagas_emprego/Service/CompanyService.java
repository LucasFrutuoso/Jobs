package com.api.vagas_emprego.Service;

import com.api.vagas_emprego.Model.Company;
import com.api.vagas_emprego.Repositories.CompanyRepository;
import com.api.vagas_emprego.Shared.CompanyDto;
import com.api.vagas_emprego.View.Model.CompanyResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository repository;



    public CompanyResponse byId(Long id) {

        Company company = repository.findById(id).orElse(null);

        CompanyResponse response = new CompanyResponse(company);
        return response;

    }
   
    public CompanyResponse register(CompanyDto companyDto) {

        Company company = new Company(companyDto);
        repository.save(company);

        CompanyResponse response = new CompanyResponse(company);
        return response;

    }

    public void delete(Long id) {

        repository.deleteById(id);

    }

}
