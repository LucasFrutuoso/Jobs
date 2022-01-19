package com.api.vagas_emprego.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.api.vagas_emprego.Shared.CandidacyDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Candidacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dateCreation;
    private Date dateUpdate;

    @ManyToOne
    private User user;

    public Candidacy(CandidacyDto candidacyDto) {

        this.setId(candidacyDto.getId());
        this.setDateCreation(candidacyDto.getDateCreation());
        this.setDateUpdate(candidacyDto.getDateUpdate());
    }

}
