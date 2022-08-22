package com.camila.shopspringboot.project_springBoot.config;

import com.camila.shopspringboot.project_springBoot.entities.Category;
import com.camila.shopspringboot.project_springBoot.entities.Order;
import com.camila.shopspringboot.project_springBoot.entities.Product;
import com.camila.shopspringboot.project_springBoot.entities.User;
import com.camila.shopspringboot.project_springBoot.entities.enums.OrderStatus;
import com.camila.shopspringboot.project_springBoot.repositories.CategoryRepository;
import com.camila.shopspringboot.project_springBoot.repositories.OrderRepository;
import com.camila.shopspringboot.project_springBoot.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null,"Camila Castro","camila@camila.com","9999999","123456");
        User user2 = new User(null,"Paulo Henrique","paulo@paulo.com","88888888","123456");

        userRepository.saveAll(Arrays.asList(user1,user2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID,user1 );
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT,user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, user1);

        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

        Category cat1 = new Category(null, "Eletrônicos");
        Category cat2 = new Category(null, "Livros");
        Category cat3 = new Category(null, "Computadores");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        Product p1 = new Product(null,"TV","Lorem ipsum dolor sit amet, consectetur.",100.5,"");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        Product p6 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6));
    }
}
