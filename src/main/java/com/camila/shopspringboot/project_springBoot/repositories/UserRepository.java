package com.camila.shopspringboot.project_springBoot.repositories;

import com.camila.shopspringboot.project_springBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
