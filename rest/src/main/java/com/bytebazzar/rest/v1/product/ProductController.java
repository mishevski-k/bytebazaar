package com.bytebazzar.rest.v1.product;

import com.bytebazzar.rest.v1.lib.ErrorEntry;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<?> find(){
        try {
            List<Product> products = productRepository.findAll();
            return ResponseEntity.ok().body(products);
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProductRequestDTO requestDTO){
        try{
            Product savedProduct = productService.create(requestDTO);

            return ResponseEntity.accepted().body(savedProduct);
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(new ErrorEntry(500, e.getMessage()));
        }
    }
}
