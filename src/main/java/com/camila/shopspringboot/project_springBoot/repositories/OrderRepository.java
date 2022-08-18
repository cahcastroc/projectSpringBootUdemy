package com.camila.shopspringboot.project_springBoot.repositories;

import com.camila.shopspringboot.project_springBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
