package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Material;

import java.util.List;

public interface MaterialService {

    List<Material> getMaterialList();

    Material findById(Integer id);

    void save(Material material);

}
