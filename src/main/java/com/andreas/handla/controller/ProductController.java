package com.andreas.handla.controller;
import com.andreas.handla.model.Product;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private final List<Product> products = new ArrayList<>();

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products;
    }

    @GetMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }

}
