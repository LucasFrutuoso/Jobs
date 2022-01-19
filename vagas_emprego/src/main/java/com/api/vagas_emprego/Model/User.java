package com.api.vagas_emprego.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.api.vagas_emprego.Shared.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String telephone;
    private String email;
    private String cpf;
    private String address;
    
    @OneToMany
    private List<Candidacy> candidacy;

    public User(UserDto userDto){
        this.setId(userDto.getId());
        this.setName(userDto.getName());
        this.setTelephone(userDto.getTelephone());
        this.setEmail(userDto.getEmail());
        this.setCpf(userDto.getCpf());
        this.setAddress(userDto.getAddress());
    }

    

}
