package com.netcracker.repository;

import com.netcracker.entity.PurchaseBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseBookRepository extends JpaRepository<PurchaseBook,Integer> {
}
