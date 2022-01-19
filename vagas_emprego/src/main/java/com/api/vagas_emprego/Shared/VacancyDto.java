package com.api.vagas_emprego.Shared;

import java.util.Date;

import com.api.vagas_emprego.View.Model.VacancyResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacancyDto {
    
    private Long id;
    private String title;
    private String requirements;
    private String activities;
    private Date dateCreation;
    private String dateUpdate;


    public VacancyDto(VacancyResponse response) {

        this.setId(response.getId());
        this.setTitle(response.getTitle());
        this.setRequirements(response.getRequirements());
        this.setActivities(response.getActivities());
        this.setDateCreation(response.getDateCreation());
        this.setDateUpdate(response.getDateUpdate());

    }
}
