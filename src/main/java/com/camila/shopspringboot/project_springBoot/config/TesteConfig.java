package com.camila.shopspringboot.project_springBoot.config;

import com.camila.shopspringboot.project_springBoot.entities.Order;
import com.camila.shopspringboot.project_springBoot.entities.User;
import com.camila.shopspringboot.project_springBoot.repositories.OrderRepository;
import com.camila.shopspringboot.project_springBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired //Injeção de dependência
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null,"Camila Castro","camila@camila.com","9999999","123456");
        User user2 = new User(null,"Paulo Henrique","paulo@paulo.com","88888888","123456");

        userRepository.saveAll(Arrays.asList(user1,user2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1);

        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
