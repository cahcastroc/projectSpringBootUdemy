package com.camila.shopspringboot.project_springBoot.services;


import com.camila.shopspringboot.project_springBoot.entities.Order;
import com.camila.shopspringboot.project_springBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findALL(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> orderObj = orderRepository.findById(id);
        return  orderObj.get();
    }
}
