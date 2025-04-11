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
        products = new ArrayList<>(Arrays.asList(
                new Product(101, "Camera", 15000),
                new Product(102, "Phone", 100000),
                new Product(103, "OnePlus Buds",1500)
        ));
        System.out.println("Created Products:\n"+products);
    }

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int productId) {
        for(Product product : products) {
            if(product.getId() == productId) {
                return product;
            }
        }
        return new Product(productId, "No Item Found!", 0);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product newProduct) {
        for(Product product : products) {
            if(product.getId() == newProduct.getId()) {
                product.setName(newProduct.getName());
                product.setPrice(newProduct.getPrice());
            }
        }
    }

    public void deleteProduct(int productId){
        for(Product p : products){
            if(p.getId() == productId){
                products.remove(p);
            }
        }
    }
}
