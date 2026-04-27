package com.infytel.service;

import com.infytel.dto.CustomerRequestDTO;
import com.infytel.dto.CustomerResponseDTO;

public interface CustomerService {
    public void createCustomer(CustomerRequestDTO customerRequestDTO);
    public CustomerResponseDTO getCustomer(Long id);
    public int remove(Long phoneNo);
}
