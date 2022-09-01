package com.camila.shopspringboot.project_springBoot.services;

import com.camila.shopspringboot.project_springBoot.entities.Category;
import com.camila.shopspringboot.project_springBoot.entities.Order;
import com.camila.shopspringboot.project_springBoot.repositories.CategoryRepository;
import com.camila.shopspringboot.project_springBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Category category = categoryRepository.findById(id).get();

        return category;
    }



}
