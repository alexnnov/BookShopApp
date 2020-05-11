package com.netcracker.service;


import com.netcracker.entity.*;
import com.netcracker.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryService {

    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private MonthRepository monthRepository;
    @Autowired
    private CustomerSaleRepository customerSaleRepository;
    @Autowired
    private ShopDistrictRepository shopDistrictRepository;
    @Autowired
    private PurchaseCustomerShopRepository purchaseCustomerShopRepository;
    @Autowired
    private PurchaseCustomerRepository purchaseCustomerRepository;
    @Autowired
    private PurchaseBookRepository purchaseBookRepository;
    @Autowired
    private PurchaseSameDistrictRepository purchaseSameDistrictRepository ;
    @Autowired
    private ShopsRepository shopsRepository;
    @Autowired
    private BookRepository bookRepository;



    public List<District> findAllDistricts(){
        return districtRepository.findAllDistricts();
    }
    public List<Month> findAllMonths(){
        return monthRepository.findAllMonths();
    }
    public List<CustomerSale> findCustomerSales(String district){
        return customerSaleRepository.findAllCustomersSales(district);
    }
    public List<ShopDistrict> findShopsFromDistricts(){
        return  shopDistrictRepository.findAllShopsFromDistricts();
    }
    public List<PurchaseCustomerShop> findPurchasesWithCustomersAndShops(){
        return purchaseCustomerShopRepository.findPurchasesWithCustomersAndShops();
    }

    public List<PurchaseCustomer> findPurchasesWithCustomers(){
        return purchaseCustomerRepository.findAll();
    }
    public List<PurchaseBook> findPurchasesWithBooks(){
        return purchaseBookRepository.findAll();
    }
    public List<PurchaseCustomer> findTask5a(){
        return purchaseCustomerRepository.findTask5a();
    }
    public List<PurchaseInSameDistrict> findTask5b(){
        return purchaseSameDistrictRepository.findAllPurchasesInSameDistricts();
    }
    public List<Shops> findTask5c(){
        return shopsRepository.findTask5c();
    }
    public List<Book> findTask5d(){
        return bookRepository.findTask5d();
    }





}
