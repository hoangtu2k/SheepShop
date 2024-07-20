package com.example.sheepshop.repository;

import com.example.sheepshop.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query(value = "Select e from Role e where e.status = 0 order by e.createDate desc")
    List<Role> getAll();



}
