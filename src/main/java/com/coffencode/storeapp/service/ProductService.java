package com.coffencode.storeapp.service;

import com.coffencode.storeapp.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
}
