package com.api.vagas_emprego.View.Model;

import com.api.vagas_emprego.Model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    
    private Long id;
    private String name;
    private String telephone;
    private String email;
    private String cpf;
    private String address;


    public UserResponse(User user){
        
        this.setId(user.getId());
        this.setName(user.getName());
        this.setTelephone(user.getTelephone());
        this.setEmail(user.getEmail());
        this.setCpf(user.getCpf());
        this.setAddress(user.getAddress());
    }

}
