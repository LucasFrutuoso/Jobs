package com.api.vagas_emprego.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.api.vagas_emprego.Shared.VacancyDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String requirements;
    private String activities;
    private Date dateCreation;
    private String dateUpdate;

    @OneToMany
    private List<Candidacy> candidacy;

    @ManyToOne
    private Company company;

    public Vacancy(VacancyDto vacancyDto) {

        this.setId(vacancyDto.getId());
        this.setTitle(vacancyDto.getTitle());
        this.setRequirements(vacancyDto.getRequirements());
        this.setActivities(vacancyDto.getActivities());
        this.setDateCreation(vacancyDto.getDateCreation());
        this.setDateUpdate(vacancyDto.getDateUpdate());

    }
}
