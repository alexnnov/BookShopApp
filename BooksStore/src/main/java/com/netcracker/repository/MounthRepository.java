package com.netcracker.repository;

import com.netcracker.entity.Mounth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MounthRepository extends JpaRepository<Mounth,Integer> {

    @Query (value = "SELECT DISTINCT id, date_part('month',date) as month FROM purchases ", nativeQuery = true)
    List<Mounth> findAllMounths( );

}
