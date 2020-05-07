package com.netcracker.service;

import com.netcracker.entity.Customer;

import com.netcracker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void update(Customer customer){
        customerRepository.save(customer);
    }

    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    public Customer findCustomer(int id){
        Optional<Customer> optional = customerRepository.findById(id);
        return optional.orElse(null);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }



}
