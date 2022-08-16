package com.camila.shopspringboot.project_springBoot.services;


import com.camila.shopspringboot.project_springBoot.entities.User;
import com.camila.shopspringboot.project_springBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Buscar todos os usuários

    public List<User> findAll(){
        return userRepository.findAll();
    }



    public User findById(Long id){
        Optional<User> userObj = userRepository.findById(id);
        return userObj.get(); //A operação get do Optional vai retornar o objeto do tipo User
    }
}
