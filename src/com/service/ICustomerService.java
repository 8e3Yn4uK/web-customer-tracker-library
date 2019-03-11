package com.service;

import com.entity.Customer;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 11.03.2019
 */

public interface ICustomerService {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer theCustomer);
}
