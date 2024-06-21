package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDetailRepository extends JpaRepository<Bill , Integer> {


}
