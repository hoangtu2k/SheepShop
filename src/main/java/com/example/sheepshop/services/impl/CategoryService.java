package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategoryList();

    Category findById(Integer id);

    void save(Category category);

    List<Category> getAllAPI();

}
