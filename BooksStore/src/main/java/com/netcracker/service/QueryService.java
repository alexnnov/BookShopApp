package com.netcracker.service;


import com.netcracker.entity.*;
import com.netcracker.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class QueryService {

    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private MounthRepository mounthRepository;
    @Autowired
    private CustomerSaleRepository customerSaleRepository;
    @Autowired
    private ShopDistrictRepository shopDistrictRepository;
    @Autowired
    private PurchaseNameShopRepository purchaseNameShopRepository;


    public List<District> findAllDistricts(){
        return districtRepository.findAllDistricts();
    }
    public List<Mounth> findAllMounths(){
        return mounthRepository.findAllMounths();
    }
    public List<CustomerSale> findCustomerSales(String district){
        return customerSaleRepository.findAllCustomersSales(district);
    }
    public List<ShopDistrict> findShopsFromDistricts(){
        return  shopDistrictRepository.findAllShopsFromDistricts();
    }
    public List<PurchaseNameShop> findAllPurchases(){
        return purchaseNameShopRepository.findAllPurchases();
    }




}
