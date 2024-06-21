package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.CollarStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollarStyleRepository extends JpaRepository<CollarStyle , Integer>{

}
