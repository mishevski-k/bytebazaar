package com.bytebazzar.rest.v1.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findOneBySku(String sku);
}
