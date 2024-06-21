package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAll();

    void save(Role role);

    Role findByName(String name);

    Role findById(Integer id);

}
