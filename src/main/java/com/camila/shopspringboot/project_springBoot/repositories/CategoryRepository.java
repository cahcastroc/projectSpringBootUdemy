package com.camila.shopspringboot.project_springBoot.repositories;

import com.camila.shopspringboot.project_springBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
