package com.netcracker.repository;


import com.netcracker.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {

}

