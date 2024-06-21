package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Size;

import java.util.List;

public interface SizeService {

    List<Size> getSizeList();

    Size findById(Integer id);

    void save(Size size);

}
