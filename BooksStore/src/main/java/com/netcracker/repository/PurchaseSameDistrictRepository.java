package com.netcracker.repository;

import com.netcracker.entity.PurchaseInSameDistrict;
import com.netcracker.entity.ShopDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseSameDistrictRepository extends JpaRepository<PurchaseInSameDistrict,Integer> {
    @Query(value = "SELECT p.id,p.date,c.lastname,c.district FROM purchases p,customers c,shops s WHERE p.seller=s.id AND p.customer=c.id AND c.district=s.district AND date_part('month',date)>=3 ORDER BY date", nativeQuery = true)
    List<PurchaseInSameDistrict> findAllPurchasesInSameDistricts();

}
