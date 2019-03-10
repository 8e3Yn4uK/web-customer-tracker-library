package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.dao.ICustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 09.03.2019
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model theModel){

        List<Customer> theCustomers = customerDAO.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }
}
