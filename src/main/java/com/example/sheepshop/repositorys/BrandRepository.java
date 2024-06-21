package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {


}