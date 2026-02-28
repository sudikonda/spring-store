package com.me.store.user.registration.service;

import com.me.store.user.registration.entity.Product;
import com.me.store.user.registration.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> showProducts() {
        return productRepository.findByProducts(BigDecimal.TEN, BigDecimal.valueOf(30));
    }

    public List<Product> showProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}