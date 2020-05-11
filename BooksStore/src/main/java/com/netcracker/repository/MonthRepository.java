package com.netcracker.repository;

import com.netcracker.entity.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MonthRepository extends JpaRepository<Month,Integer> {

    @Query (value = "SELECT DISTINCT date_part('month',date) as date FROM purchases order by date; ", nativeQuery = true)
    List<Month> findAllMonths( );

}
