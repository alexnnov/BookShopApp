package com.netcracker.controller;

import com.netcracker.entity.*;
import com.netcracker.repository.PurchaseNameShopRepository;
import com.netcracker.service.BookNamePriceService;
import com.netcracker.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/query")
public class QueryController {

    @Autowired
    private QueryService queryService;

    @GetMapping ("/district/find/all")
    public List<District> findAllDistricts () {
        return queryService.findAllDistricts();
    }
    @GetMapping ("/mounth/find/all")
    public List<Mounth> findAllMounths () {
        return queryService.findAllMounths();
    }
    @GetMapping ("/CustomerSale/find/all")
    public List<CustomerSale> findAllCustomerSales (@RequestParam String district) {
       return queryService.findCustomerSales(district);
    }
    @GetMapping ("/shopsFromDistricts")
    public List<ShopDistrict> findAllShopsFromDistricts () {
        return queryService.findShopsFromDistricts();
    }
    @GetMapping ("/purchasesWithCustomersAndShops")
    public List<PurchaseNameShop> finAllPurchases () {
        return queryService.findAllPurchases();
    }



}
