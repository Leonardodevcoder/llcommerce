package com.devleonardo.llcommerce.repositories;


import com.devleonardo.llcommerce.entities.OrderItem;
import com.devleonardo.llcommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}