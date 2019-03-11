package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 09.03.2019
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // injecting our customer service
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel){

        // get customers from the service
        List<Customer> theCustomers = customerService.getCustomers();
        // add the customers to the model
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        return "customer-form";
    }
}
