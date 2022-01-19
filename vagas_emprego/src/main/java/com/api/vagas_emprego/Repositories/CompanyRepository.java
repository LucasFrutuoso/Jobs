package com.api.vagas_emprego.Repositories;

import com.api.vagas_emprego.Model.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}
