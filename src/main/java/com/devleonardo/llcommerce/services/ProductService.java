package com.devleonardo.llcommerce.services;

import com.devleonardo.llcommerce.dto.ProductDTO;
import com.devleonardo.llcommerce.entities.Product;
import com.devleonardo.llcommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

   @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
       Product product = repository.findById(id).get();
       return new ProductDTO(product);
    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
       Page<Product> result = repository.findAll(pageable);
       return result.map(ProductDTO::new);
    }
}