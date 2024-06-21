package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{

}
