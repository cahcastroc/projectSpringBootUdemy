package com.camila.shopspringboot.project_springBoot.config;

import com.camila.shopspringboot.project_springBoot.entities.User;
import com.camila.shopspringboot.project_springBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired //Injeção de dependência
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null,"Camila Castro","camila@camila.com","9999999","123456");
        User user2 = new User(null,"Paulo Henrique","paulo@paulo.com","88888888","123456");

        userRepository.saveAll(Arrays.asList(user1,user2));



    }
}
