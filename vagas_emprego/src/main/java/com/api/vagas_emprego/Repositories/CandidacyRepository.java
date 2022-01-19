package com.api.vagas_emprego.Repositories;

import com.api.vagas_emprego.Model.Candidacy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidacyRepository extends JpaRepository<Candidacy, Long>{
    
}
