package com.api.vagas_emprego.Service;

import com.api.vagas_emprego.Model.Company;
import com.api.vagas_emprego.Model.Vacancy;
import com.api.vagas_emprego.Repositories.CompanyRepository;
import com.api.vagas_emprego.Repositories.VacancyRepository;
import com.api.vagas_emprego.Shared.VacancyDto;
import com.api.vagas_emprego.View.Model.VacancyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacancyService {

    @Autowired
    VacancyRepository repository;

    @Autowired
    CompanyRepository companyRepository;


    public VacancyResponse register(Long id, VacancyDto vacancyDto) {

        Company company = companyRepository.findById(id).orElse(null);


        Vacancy vacancy = new Vacancy(vacancyDto);
        vacancy.setCompany(company);

        repository.save(vacancy);

        VacancyResponse response = new VacancyResponse(vacancy);
        return response;

    }

    public VacancyResponse modify(Long id, VacancyDto vacancyDto) {

        vacancyDto.setId(null);
        Company company = companyRepository.findById(id).orElse(null);

        Vacancy vacancy = new Vacancy(vacancyDto);
        vacancy.setCompany(company);

        VacancyResponse response = new VacancyResponse(vacancy);
        repository.save(vacancy);
        return response;
    }
    

    public void delete(Long id){
        repository.deleteById(id);

    }



}
