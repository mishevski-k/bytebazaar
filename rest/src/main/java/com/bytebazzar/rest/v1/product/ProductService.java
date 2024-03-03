package com.bytebazzar.rest.v1.product;

import lombok.AllArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public Product create(ProductRequestDTO productDTO) throws Exception{

        if(productDTO.getName() == null){
            throw new Exception("Name cannot be empty");
        }

        if(productDTO.getCurrency() == null){
            throw new Exception("Default currency cannot be empty");
        }

        if(productRepository.findOneBySku(productDTO.getSku()) != null){
            throw new Exception("Sku is already in use");
        }

        Product product = productDTO.toProduct();
        product.setCreatedAt(new Date());

        return productRepository.save(product);
    }
}
