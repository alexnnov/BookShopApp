package com.netcracker.controller;

import com.netcracker.entity.Customer;

import com.netcracker.service.BookService;
import com.netcracker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;




    @PostMapping ("/create")
    @ResponseStatus (code = HttpStatus.CREATED)
    public void createBook(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Customer> updateShop(@RequestBody Customer customer,@PathVariable("id") String id){
        customerService.update(customer);
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping ("/delete/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable int id) {
        customerService.remove(id);
    }



    @GetMapping ("/find")
    public ResponseEntity<Customer> findById (@RequestParam int id) {
        Customer customer = customerService.findCustomer(id);

        if (customer != null) {
            return ResponseEntity.ok(customer);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping ("/find/all")
    public List<Customer> findAll () {
        return customerService.findAll();
    }


}
