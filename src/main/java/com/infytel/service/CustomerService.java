package com.infytel.service;

import com.infytel.dto.CustomerDTO;
import com.infytel.dto.UpdateCustomerDTO;

import java.util.List;

public interface CustomerService {
    public void create(CustomerDTO customerDTO);

    public CustomerDTO getByPhoneNo(Long phoneNo);

    public int remove(Long phoneNo);

    public List<CustomerDTO> getAll();

    public String updateByPhoneNo(Long phoneNo, UpdateCustomerDTO updateCustomerDTO);
}
