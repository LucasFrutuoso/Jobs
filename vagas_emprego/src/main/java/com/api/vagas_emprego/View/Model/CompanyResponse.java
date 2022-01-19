package com.api.vagas_emprego.View.Model;

import java.util.Date;

import com.api.vagas_emprego.Model.Company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyResponse {
    
    private Long id;
    private String name;
    private Long telephone;
    private String email;
    private String cnpj;
    private Date dateCreation;
    private String dateUpdate;



    public CompanyResponse(Company company){
        this.setId(company.getId());
        this.setName(company.getName());
        this.setTelephone(company.getTelephone());
        this.setEmail(company.getEmail());
        this.setCnpj(company.getCnpj());
        this.setDateCreation(company.getDateCreation());
        this.setDateUpdate(company.getDateUpdate());

    }
}
