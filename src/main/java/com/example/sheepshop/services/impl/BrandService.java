package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getBrandList();

    Brand findById(Integer id);

    void save(Brand brand);


}
