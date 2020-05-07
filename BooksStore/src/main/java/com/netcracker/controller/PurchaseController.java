package com.netcracker.controller;


import com.netcracker.entity.Purchase;
import com.netcracker.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;



    @PostMapping ("/create")
    @ResponseStatus (code = HttpStatus.CREATED)
    public void createPurchase(@RequestBody Purchase purchase) {
        purchaseService.addPurchase(purchase);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Purchase> updatePurchase(@RequestBody Purchase purchase,@PathVariable("id") String id){
        purchaseService.update(purchase);
        return ResponseEntity.ok(purchase);
    }

    @DeleteMapping ("/delete/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deletePurchase(@PathVariable int id) {
        purchaseService.remove(id);
    }



    @GetMapping ("/find")
    public ResponseEntity<Purchase> findById (@RequestParam int id) {
        Purchase purchase = purchaseService.findPurchase(id);

        if (purchase != null) {
            return ResponseEntity.ok(purchase);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping ("/find/all")
    public List<Purchase> findAll () {
        return purchaseService.findAll();
    }


}
