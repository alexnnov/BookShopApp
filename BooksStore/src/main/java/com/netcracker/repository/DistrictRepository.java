package com.netcracker.repository;

import com.netcracker.entity.BookNamePrice;
import com.netcracker.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Integer> {

    @Query (value = "SELECT DISTINCT district FROM customers ", nativeQuery = true)
    List<District> findAllDistricts( );

}
