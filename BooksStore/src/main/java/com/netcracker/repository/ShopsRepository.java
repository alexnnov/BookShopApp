package com.netcracker.repository;

import com.netcracker.entity.Shops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface ShopsRepository extends JpaRepository<Shops,Integer> {
    @Query(value = "SELECT s.id,s.name,s.district,s.comission FROM purchases p,customers c,shops s WHERE p.customer=c.id AND p.seller=s.id AND NOT s.district='Avtozavodskiy' AND c.sale>=10 AND c.sale<=15 ", nativeQuery = true)
    List<Shops> findTask5c();


}






