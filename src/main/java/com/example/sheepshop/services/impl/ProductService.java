package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    void save(Product product);

    Product findById(Long id);

    Product findByName(String name);

    List<Product> getAllAPI();

}
