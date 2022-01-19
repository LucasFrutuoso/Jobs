package com.api.vagas_emprego.View.Model;

import java.util.Date;

import com.api.vagas_emprego.Model.Candidacy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidacyResponse {

    private Integer id;
    private Date dateCreation;
    private Date dateUpdate;

    public CandidacyResponse(Candidacy candidacy){

        this.setId(candidacy.getId());
        this.setDateCreation(candidacy.getDateCreation());
        this.setDateUpdate(candidacy.getDateUpdate());

    }

}
