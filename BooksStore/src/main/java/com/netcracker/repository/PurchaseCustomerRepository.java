package com.netcracker.repository;

import com.netcracker.entity.PurchaseCustomer;
import com.netcracker.entity.ShopDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseCustomerRepository extends JpaRepository<PurchaseCustomer,Integer> {
    @Query(value = "SELECT DISTINCT purchases.id,purchases.date,customers.sale, customers.lastname FROM customers,purchases WHERE customers.id=purchases.customer AND purchases.summary>=60000;", nativeQuery = true)
    List<PurchaseCustomer> findTask5a();
}
