package com.api.vagas_emprego.Shared;

import java.util.Date;

import com.api.vagas_emprego.View.Model.CompanyResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CompanyDto {
    private Long id;
    private String name;
    private Long telephone;
    private String email;
    private String cnpj;
    private Date dateCreation;
    private String dateUpdate;

    public CompanyDto(CompanyResponse response){
        
        this.setId(response.getId());
        this.setName(response.getName());
        this.setTelephone(response.getTelephone());
        this.setEmail(response.getEmail());
        this.setCnpj(response.getCnpj());
        this.setDateCreation(response.getDateCreation());
        this.setDateUpdate(response.getDateUpdate());

    }
}
