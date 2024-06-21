package com.example.sheepshop.services.impl;

import com.example.sheepshop.entitys.UserRole;

import java.util.List;

public interface UserRoleService {

    List<UserRole> getAll();

    void save(UserRole userRole);

}
