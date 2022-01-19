package com.api.vagas_emprego.Shared;

import java.util.Date;
import com.api.vagas_emprego.View.Model.CandidacyResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
public class CandidacyDto {
    
    private Integer id;
    private Date dateCreation;
    private Date dateUpdate;


    public CandidacyDto(CandidacyResponse response){

        this.setId(response.getId());
        this.setDateCreation(response.getDateCreation());
        this.setDateUpdate(response.getDateUpdate());


    }
}
