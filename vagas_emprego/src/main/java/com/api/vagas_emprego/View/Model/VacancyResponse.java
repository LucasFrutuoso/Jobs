package com.api.vagas_emprego.View.Model;

import java.util.Date;

import com.api.vagas_emprego.Model.Vacancy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacancyResponse {
    
    private Long id;
    private String title;
    private String requirements;
    private String activities;
    private Date dateCreation;
    private String dateUpdate;


    public VacancyResponse(Vacancy vacancy){

        this.setId(vacancy.getId());
        this.setTitle(vacancy.getTitle());
        this.setRequirements(vacancy.getRequirements());
        this.setActivities(vacancy.getActivities());
        this.setDateCreation(vacancy.getDateCreation());
        this.setDateUpdate(vacancy.getDateUpdate());

    }

}
