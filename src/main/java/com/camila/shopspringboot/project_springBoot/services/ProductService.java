package com.camila.shopspringboot.project_springBoot.services;


import com.camila.shopspringboot.project_springBoot.entities.Product;
import com.camila.shopspringboot.project_springBoot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Product product = productRepository.findById(id).get();
        return product;
    }

}
