package com.lambdaschool.orders.repos;

import com.lambdaschool.orders.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customers, Long>
{
}
