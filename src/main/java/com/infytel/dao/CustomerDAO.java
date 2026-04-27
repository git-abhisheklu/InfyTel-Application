package com.infytel.dao;

import com.infytel.entity.Customer;

import java.io.FileNotFoundException;

public interface CustomerDAO {
    public void insert(Customer customer) throws FileNotFoundException;
    public int remove(Long phoneNo);
}
