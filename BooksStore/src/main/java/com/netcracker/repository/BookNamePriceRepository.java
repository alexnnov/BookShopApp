package com.netcracker.repository;

import com.netcracker.entity.BookNamePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookNamePriceRepository extends JpaRepository<BookNamePrice,Integer> {

    @Query (value = "SELECT DISTINCT id,name,price FROM books WHERE name like '%windows%' or price>20000 order by name asc, price desc", nativeQuery = true)
    List<BookNamePrice> findBookNamePriceWindows();

    @Query (value = "SELECT DISTINCT id,name,price FROM books ", nativeQuery = true)
    List<BookNamePrice> findBookNamePrice();

}
