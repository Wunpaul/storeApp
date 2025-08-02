package com.coffencode.storeapp.service;

import com.coffencode.storeapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> products =  new ArrayList<>();

    public ProductServiceImpl() {
        products.add(new Product(1, "Laptop", 1200.0));
        products.add(new Product(2, "Phone", 800.0));
        products.add(new Product(3, "Headphones", 100.0));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        if (products.stream().anyMatch(p -> p.getId() == product.getId())) {
            System.out.println("Product already exists: "  + product.getId());
            return;
        }
        products.add(product);
    }
}
