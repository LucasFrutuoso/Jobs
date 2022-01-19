package com.api.vagas_emprego.Service;

import com.api.vagas_emprego.Model.User;
import com.api.vagas_emprego.Model.Vacancy;
import com.api.vagas_emprego.Repositories.CandidacyRepository;
import com.api.vagas_emprego.Repositories.UserRepository;
import com.api.vagas_emprego.Repositories.VacancyRepository;
import com.api.vagas_emprego.Shared.UserDto;
import com.api.vagas_emprego.View.Model.UserResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    CandidacyRepository candidacyRepository;

    @Autowired
    VacancyRepository vacancyRepository;

    public UserResponse byId(Long id) {

        User users = repository.findById(id).orElse(null);

        UserResponse response = new UserResponse(users);
        return response;
    }


    public UserResponse register(Long id, Long cod) {

        User users = repository.findById(id).orElse(null);
        
        Vacancy vacancy = vacancyRepository.findById(cod).orElse(null); 

        vacancyRepository.save(vacancy);
        repository.save(users);

        UserResponse response = new UserResponse(users);
        return response;

    }


    public UserResponse modify(Long id, UserDto userDto) {

        userDto.setId(null);

        User users = repository.findById(id).orElse(null);

        UserResponse response = new UserResponse(users);
        repository.save(users);

        return response;

    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
