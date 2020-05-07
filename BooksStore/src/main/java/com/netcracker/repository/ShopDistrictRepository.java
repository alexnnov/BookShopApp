package com.netcracker.repository;

import com.netcracker.entity.ShopDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShopDistrictRepository extends JpaRepository<ShopDistrict,Integer> {

    @Query (value = "SELECT DISTINCT id, name FROM shops  WHERE district = 'Sormovskiy' or district = 'Sovetskiy' order by id", nativeQuery = true)
    List<ShopDistrict> findAllShopsFromDistricts();

}
