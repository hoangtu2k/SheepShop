package com.example.sheepshop.service;

import com.example.sheepshop.entity.Role;
import com.example.sheepshop.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.getAll();
    }

}
