package com.netcracker.service;

import com.netcracker.entity.Purchase;
import com.netcracker.repository.PurchaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public void addPurchase(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public void update(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public void remove(int id) {
        purchaseRepository.deleteById(id);
    }

    public Purchase findPurchase(int id){
        Optional<Purchase> optional = purchaseRepository.findById(id);
        return optional.orElse(null);
    }

    public List<Purchase> findAll(){
        return purchaseRepository.findAll();
    }



}
