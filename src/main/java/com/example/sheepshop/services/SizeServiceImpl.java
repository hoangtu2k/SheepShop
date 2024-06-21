package com.example.sheepshop.services;

import com.example.sheepshop.entitys.Size;
import com.example.sheepshop.repositorys.SizeRepository;
import com.example.sheepshop.services.impl.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    private SizeRepository sizeRepository;


    @Override
    public List<Size> getSizeList() {
        return sizeRepository.findAll();
    }

    @Override
    public Size findById(Integer id) {
        return sizeRepository.findById(id).get();
    }
    @Override
    public void save(Size size) {
        sizeRepository.save(size);
    }
}
