package com.example.sheepshop.services;

import com.example.sheepshop.entitys.Role;
import com.example.sheepshop.repositorys.RoleRepository;
import com.example.sheepshop.services.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Role findById(Integer id) {
        return roleRepository.findById(id).get();
    }


}
