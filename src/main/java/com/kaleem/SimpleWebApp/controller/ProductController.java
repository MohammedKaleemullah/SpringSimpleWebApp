package com.kaleem.SimpleWebApp.controller;

import com.kaleem.SimpleWebApp.model.Product;
import com.kaleem.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductsById(@PathVariable int productId) {
        return productService.getProductsById(productId);
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Successfully added "+product.toString();
    }

    @PutMapping("/updateProduct")
    public String updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return "Successfully updated "+product.getId();
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId){
        productService.deleteProduct(productId);
        return "Successfully deleted "+productId;
    }
}
