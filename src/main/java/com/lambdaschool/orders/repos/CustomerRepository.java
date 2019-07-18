package com.lambdaschool.orders.repos;

import com.lambdaschool.orders.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers, Long>
{
    Customers findByName(String name);
}
