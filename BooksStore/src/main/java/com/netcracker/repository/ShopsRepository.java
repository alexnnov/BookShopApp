package com.netcracker.repository;

import com.netcracker.entity.Shops;
//import com.netcracker.entity.ShopsNameOnly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


public interface ShopsRepository extends JpaRepository<Shops,Integer> {


}






