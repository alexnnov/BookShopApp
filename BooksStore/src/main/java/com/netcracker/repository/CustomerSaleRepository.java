package com.netcracker.repository;

import com.netcracker.entity.CustomerSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerSaleRepository extends JpaRepository<CustomerSale,Integer> {

    @Query (value = "SELECT DISTINCT id, name, sale FROM purchases p  WHERE p.district = :district", nativeQuery = true)
    List<CustomerSale> findAllCustomersSales(@Param("district") String district );

}
