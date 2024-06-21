package com.example.sheepshop.services;

import com.example.sheepshop.entitys.CollarStyle;
import com.example.sheepshop.repositorys.CollarStyleRepository;
import com.example.sheepshop.services.impl.CollarStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollarStyleServiceImpl implements CollarStyleService {

    @Autowired
    private CollarStyleRepository collarStyleRepository;

    @Override
    public List<CollarStyle> getCollarStyleList() {
        return collarStyleRepository.findAll();
    }

    @Override
    public CollarStyle findById(Integer id) {
        return collarStyleRepository.findById(id).get();
    }

    @Override
    public void save(CollarStyle collarStyle) {
            collarStyleRepository.save(collarStyle);
    }


}
