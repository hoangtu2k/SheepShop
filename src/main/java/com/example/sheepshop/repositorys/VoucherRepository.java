package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Integer>{

}
