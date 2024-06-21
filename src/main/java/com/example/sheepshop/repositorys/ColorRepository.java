package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer>{

}
