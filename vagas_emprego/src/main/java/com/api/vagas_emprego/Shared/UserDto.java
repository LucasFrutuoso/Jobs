package com.api.vagas_emprego.Shared;

import com.api.vagas_emprego.View.Model.UserResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private Long id;
    private String name;
    private String telephone;
    private String email;
    private String cpf;
    private String address;

    public UserDto(UserResponse response){
        this.setId(response.getId());
        this.setName(response.getName());
        this.setTelephone(response.getTelephone());
        this.setEmail(response.getEmail());
        this.setCpf(response.getCpf());
        this.setAddress(response.getAddress());

    }
}
