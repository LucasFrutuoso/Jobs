package com.api.vagas_emprego.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.api.vagas_emprego.Shared.CompanyDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long telephone;
    private String email;
    private String cnpj;
    private Date dateCreation;
    private String dateUpdate;

    
    
    @OneToMany
    private List<Vacancy> vacancy;

    public Company(CompanyDto companyDto){
        this.setId(companyDto.getId());
        this.setName(companyDto.getName());
        this.setTelephone(companyDto.getTelephone());
        this.setEmail(companyDto.getEmail());
        this.setCnpj(companyDto.getCnpj());
        this.setDateCreation(companyDto.getDateCreation());
        this.setDateUpdate(companyDto.getDateUpdate());

    }

}
