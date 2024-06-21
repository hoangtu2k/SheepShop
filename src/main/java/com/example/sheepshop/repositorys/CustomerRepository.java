package com.example.sheepshop.repositorys;

import com.example.sheepshop.entitys.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Integer>{

}
