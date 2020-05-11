package com.netcracker.repository;

import com.netcracker.entity.PurchaseCustomerShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseCustomerShopRepository extends JpaRepository<PurchaseCustomerShop,Integer> {

    @Query(value = "SELECT id,bookname,number,lastname,number,shop FROM extended_purchases ", nativeQuery = true)
    List<PurchaseCustomerShop> findPurchasesWithCustomersAndShops( );

}
