package com.api.vagas_emprego.Service;

import com.api.vagas_emprego.Model.Candidacy;
import com.api.vagas_emprego.Repositories.CandidacyRepository;
import com.api.vagas_emprego.Shared.CandidacyDto;
import com.api.vagas_emprego.View.Model.CandidacyResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidacyService {

    @Autowired
    CandidacyRepository repository;

    public CandidacyResponse register(CandidacyDto candidacyDto) {

        Candidacy candidacy = new Candidacy(candidacyDto);
        repository.save(candidacy);

        CandidacyResponse response = new CandidacyResponse(candidacy);

        return response;

    }

    public CandidacyResponse byId(Long id) {

        Candidacy candidacy = repository.findById(id).orElse(null);

        CandidacyResponse response = new CandidacyResponse(candidacy);
        return response;

    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    

}
