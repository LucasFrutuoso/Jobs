package com.api.vagas_emprego.View.Controller;

import com.api.vagas_emprego.Service.CandidacyService;
import com.api.vagas_emprego.Shared.CandidacyDto;
import com.api.vagas_emprego.View.Model.CandidacyResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work/v1/user/{id}")
public class CandidacyController {

    @Autowired
    CandidacyService candidacyService;

    @PostMapping("/job/{id}/apply")
    public ResponseEntity<?> register(@RequestBody CandidacyDto candidacyDto, @PathVariable Long id){

        CandidacyResponse response = candidacyService.register(candidacyDto);

        return ResponseEntity.ok().body(response);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        candidacyService.delete(id);

        return ResponseEntity.ok().body(id);
    }
    


}
