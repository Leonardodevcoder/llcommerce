package com.devleonardo.llcommerce.repositories;

import com.devleonardo.llcommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}