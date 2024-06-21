package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
