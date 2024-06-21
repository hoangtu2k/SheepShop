package com.example.sheepshop.services;

import com.example.sheepshop.entitys.Material;
import com.example.sheepshop.repositorys.MaterialRepository;
import com.example.sheepshop.services.impl.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public List<Material> getMaterialList() {
        return materialRepository.findAll();
    }

    @Override
    public Material findById(Integer id) {
        return materialRepository.findById(id).get();
    }

    @Override
    public void save(Material material) {
        materialRepository.save(material);
    }

}
