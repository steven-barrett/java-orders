package com.lambdaschool.orders.services;

import com.lambdaschool.orders.model.Customers;
import com.lambdaschool.orders.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    CustomerRepository custrepo;

    @Override
    public List<Customers> findAll()
    {
        List<Customers> list = new ArrayList<>();

        custrepo.findAll().iterator().forEachRemaining(list::add);

        // normal list sorting here

        return list;
    }
}
