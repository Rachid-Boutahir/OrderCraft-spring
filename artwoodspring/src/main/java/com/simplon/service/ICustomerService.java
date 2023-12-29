package com.simplon.service;

import com.simplon.entity.Customer;

import java.util.List;
// import com.joseph..exception.ResourceNotFoundException;

public interface ICustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}