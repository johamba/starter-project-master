package com.bankoffairfield.customeraccountsmgmtapp.controller;

import com.bankoffairfield.customeraccountsmgmtapp.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/cadman/customer"})
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = {"/list"})
    public ModelAndView listCustomers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customers", customerService.getCustomers());
        modelAndView.setViewName("customer/list");
        return modelAndView;
    }
}
