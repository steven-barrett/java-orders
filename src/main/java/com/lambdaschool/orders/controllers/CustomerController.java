package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.model.Customers;
import com.lambdaschool.orders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/all",
            produces = {"application.json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customers> myCustomers = customerService.findAll();

        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }

}
