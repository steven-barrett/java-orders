package com.lambdaschool.orders.services;

import com.lambdaschool.orders.model.Customers;

import java.util.List;

public interface CustomerService
{
    List<Customers> findAll();
}
