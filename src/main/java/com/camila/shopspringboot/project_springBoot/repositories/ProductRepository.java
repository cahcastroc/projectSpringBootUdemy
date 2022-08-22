package com.camila.shopspringboot.project_springBoot.repositories;

import com.camila.shopspringboot.project_springBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
