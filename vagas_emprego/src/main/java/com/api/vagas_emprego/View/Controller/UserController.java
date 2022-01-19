package com.api.vagas_emprego.View.Controller;

import com.api.vagas_emprego.Service.UserService;
import com.api.vagas_emprego.Shared.UserDto;
import com.api.vagas_emprego.View.Model.UserResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/work/v1/user/{id}")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/job/{id}/apply")
    public ResponseEntity<?> register(@RequestBody UserDto userDto, @PathVariable Long id, Long cod) {

        UserResponse response = userService.register(id, cod);

        return ResponseEntity.ok().body(response);

    }

    @GetMapping
    public ResponseEntity<?> consult(@PathVariable Long id) {

        UserResponse response = userService.byId(id);
        return ResponseEntity.ok().body(response);

    }

    @PutMapping
    public ResponseEntity<?> modify(@PathVariable Long id, @RequestBody UserDto userDto) {

        UserResponse response = userService.modify(id, userDto);

        return ResponseEntity.ok().body(response);

    }

    @DeleteMapping("/applies/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        userService.delete(id);

        return ResponseEntity.ok().body(id);

    }

}
