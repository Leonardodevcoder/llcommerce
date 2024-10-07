package com.devleonardo.llcommerce.repositories;


import com.devleonardo.llcommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}