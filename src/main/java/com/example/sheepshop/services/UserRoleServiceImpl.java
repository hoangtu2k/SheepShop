package com.example.sheepshop.services;

import com.example.sheepshop.entitys.UserRole;
import com.example.sheepshop.repositorys.UserRoleRepository;
import com.example.sheepshop.services.impl.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;


    @Override
    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public void save(UserRole userRole) {
        userRoleRepository.save(userRole);
    }


}
