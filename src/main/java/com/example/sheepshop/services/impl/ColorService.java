package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Color;

import java.util.List;

public interface ColorService {

    List<Color> getColorList();

    Color findById(Integer id);

    void save(Color color);

}
