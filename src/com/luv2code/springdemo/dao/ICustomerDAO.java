package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 10.03.2019
 */

public interface ICustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);
}
