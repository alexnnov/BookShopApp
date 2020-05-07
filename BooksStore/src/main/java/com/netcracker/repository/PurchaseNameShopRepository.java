package com.netcracker.repository;

import com.netcracker.entity.PurchaseNameShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseNameShopRepository extends JpaRepository<PurchaseNameShop,Integer> {

    @Query (value = "SELECT p.id,p.date,p.seller,p.customer,p.book,p.number,p.summary, c.lastname, s.name from purchases p, customers c, shops s where p.customer = c.id and p.seller = s.id;", nativeQuery = true)
    List<PurchaseNameShop> findAllPurchases();

}
