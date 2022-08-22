package com.camila.shopspringboot.project_springBoot.resources;


import com.camila.shopspringboot.project_springBoot.entities.Category;
import com.camila.shopspringboot.project_springBoot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.findAll());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){

        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.findById(id));
    }


}
