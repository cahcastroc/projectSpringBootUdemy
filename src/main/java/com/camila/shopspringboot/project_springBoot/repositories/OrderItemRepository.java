package com.camila.shopspringboot.project_springBoot.repositories;

import com.camila.shopspringboot.project_springBoot.entities.OrderItem;
import com.camila.shopspringboot.project_springBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
