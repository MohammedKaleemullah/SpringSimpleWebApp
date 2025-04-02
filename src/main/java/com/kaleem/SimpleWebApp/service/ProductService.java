package com.kaleem.SimpleWebApp.service;

import com.kaleem.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products;

    public ProductService() {
        products = Arrays.asList(
                new Product(101, "Camera", 15000),
                new Product(102, "Phone", 100000),
                new Product(103, "OnePlus Buds",1500)
        );
    }

    public List<Product> getProducts() {
        return products;
    }
}
