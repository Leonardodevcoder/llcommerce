package com.devleonardo.llcommerce.services;

import com.devleonardo.llcommerce.dto.OrderDTO;
import com.devleonardo.llcommerce.entities.Order;
import com.devleonardo.llcommerce.exceptions.ResourceNotFoundException;
import com.devleonardo.llcommerce.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
