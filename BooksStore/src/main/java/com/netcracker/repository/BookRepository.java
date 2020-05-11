package com.netcracker.repository;

import com.netcracker.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface BookRepository extends JpaRepository<Book,Integer> {
    @Query(value = "SELECT b.id,b.name,b.price,b.warehouse,b.number FROM books b,shops s,purchases p WHERE b.id=p.book AND s.id=p.seller AND b.warehouse=s.id AND b.number>10 ORDER BY b.number;",nativeQuery=true)
    List<Book> findTask5d();

}


