package com.fullstack.service;

import com.fullstack.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    Customer signUp(Customer customer);

    List<Customer> saveAll(List<Customer> customerList);

    boolean signIn(String custEmailId, String custPassword);

    Optional<Customer> findById(int custId);

    List<Customer> findByName(String custName);

    List<Customer> findAll();

    Customer update(Customer customer);

    void deleteById(int custId);
}
