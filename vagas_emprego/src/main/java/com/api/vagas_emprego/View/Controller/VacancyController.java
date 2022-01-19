package com.api.vagas_emprego.View.Controller;

import com.api.vagas_emprego.Service.VacancyService;
import com.api.vagas_emprego.Shared.VacancyDto;
import com.api.vagas_emprego.View.Model.VacancyResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work/v1/company/{id}")
public class VacancyController {

    @Autowired
    VacancyService service;

    @PostMapping("/{id}/job")
    public ResponseEntity<?> register(@RequestBody VacancyDto vacancyDto, @PathVariable Long id) {

        VacancyResponse response = service.register(id, vacancyDto);

        return ResponseEntity.ok().body(response);

    }

    @PutMapping
    public ResponseEntity<?> modify(@RequestBody VacancyDto vacancyDto, @PathVariable Long id) {
        VacancyResponse response = service.modify(id, vacancyDto);

        return ResponseEntity.ok().body(response);

    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);

        return ResponseEntity.ok().body(id);
    }

}
