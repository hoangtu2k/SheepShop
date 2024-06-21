package com.example.sheepshop.services;

import com.example.sheepshop.entitys.Brand;
import com.example.sheepshop.repositorys.BrandRepository;
import com.example.sheepshop.services.impl.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getBrandList() {
        return brandRepository.findAll();
    }

    @Override
    public Brand findById(Integer id) {
        return brandRepository.findById(id).get();
    }

    @Override
    public void save(Brand brand) {
        brandRepository.save(brand);
    }


}
