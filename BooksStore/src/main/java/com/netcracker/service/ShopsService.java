package com.netcracker.service;

import com.netcracker.entity.Shops;
//import com.netcracker.entity.ShopsNameOnly;
import com.netcracker.model.Shop;
import com.netcracker.repository.ShopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class ShopsService {

    @Autowired
    private ShopsRepository shopsRepository;

    public void addShop(Shops shops){
        shopsRepository.save(shops);
    }

    public void update(Shops shops){
        shopsRepository.save(shops);
    }

    public void remove(int id) {
        shopsRepository.deleteById(id);
    }

    public Shops findShop(int id){
        Optional<Shops> optional = shopsRepository.findById(id);
        return optional.orElse(null);
    }

    public List<Shops> findAll(){
        return shopsRepository.findAll();
    }

    /* public void updatePartially(ShopsNameOnly shopsNameOnly, String id){
        shopsRepository.save(shopsNameOnly, id);
    }*/


    /*public void update(Shops shops){
        shopsRepository.
    }

    public void update(Shop shop){
        shopsRepository
        
    }*/



//    public List<Employee> findAll(){
//        return employeeRepository.findAll();
//    }
//
//    public Employee findById(int id){
//        Optional<Employee> optional = employeeRepository.findById(id);
//        return optional.orElse(null);
//    }
//
//    public List<Employee> findByName(String name){
//        return employeeRepository.findByName(name);
//    }
//
//    public void save(Employee employee){
//        employeeRepository.save(employee);
//    }
//
//    public List<Employee> retrieveByName(String name){
//        return employeeRepository.retrieveByName(name);
//    }

}
