package com.camila.shopspringboot.project_springBoot.resources;


import com.camila.shopspringboot.project_springBoot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"Maria","maria@gmail.com","9999-9999","123456");

        return ResponseEntity.ok().body(user);
    }

}
