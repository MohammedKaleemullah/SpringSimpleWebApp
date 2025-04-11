package com.kaleem.SimpleWebApp.controller;

import com.kaleem.SimpleWebApp.model.Product;
import com.kaleem.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/products/{productId}")
    public Product getProductsById(@PathVariable int productId) {
        return productService.getProductsById(productId);
    }
}
