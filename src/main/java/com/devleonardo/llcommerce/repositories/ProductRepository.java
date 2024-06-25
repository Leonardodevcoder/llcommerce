package com.devleonardo.llcommerce.repositories;

import com.devleonardo.llcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}