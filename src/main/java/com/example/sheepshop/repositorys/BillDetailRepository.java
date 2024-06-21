package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Integer> {


}
