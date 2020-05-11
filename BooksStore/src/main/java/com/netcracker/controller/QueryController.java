package com.netcracker.controller;

import com.netcracker.entity.*;
import com.netcracker.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping ("/month/find/all")
    public List<Month> findAllMonths () {
        return queryService.findAllMonths();
    }
    @GetMapping ("/CustomerSale/find/all")
    public List<CustomerSale> findAllCustomerSales (@RequestParam String district) {
       return queryService.findCustomerSales(district);
    }
    @GetMapping ("/shopsFromDistricts")
    public List<ShopDistrict> findAllShopsFromDistricts () {
        return queryService.findShopsFromDistricts();
    }
    @GetMapping ("/PurchasesWithCustomersAndShops")
    public List<PurchaseCustomerShop> findAllPurchasesWithCustomersAndShops () {
        return queryService.findPurchasesWithCustomersAndShops();
    }
    @GetMapping ("/PurchasesWithCustomers")
    public List<PurchaseCustomer> findAllPurchasesWithCustomers () {
        return queryService.findPurchasesWithCustomers();
    }
    @GetMapping ("/PurchasesWithBooks")
    public List<PurchaseBook> findAllPurchasesWithBooks () {
        return queryService.findPurchasesWithBooks();
    }
    @GetMapping ("/Task5a")
    public List<PurchaseCustomer> findTask5a () {
        return queryService.findTask5a();
    }
    @GetMapping ("/Task5b")
    public List<PurchaseInSameDistrict> findTask5b () {
        return queryService.findTask5b();
    }
    @GetMapping ("/Task5c")
    public List<Shops> findTask5c () {
        return queryService.findTask5c();
    }
    @GetMapping ("/Task5d")
    public List<Book> findTask5d () {
        return queryService.findTask5d();
    }


}
