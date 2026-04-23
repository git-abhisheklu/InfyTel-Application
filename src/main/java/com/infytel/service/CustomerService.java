package com.infytel.service;

import com.infytel.dto.CustomerRequestDTO;
import com.infytel.dto.CustomerResponseDTO;

public interface CustomerService {
    public String createCustomer(CustomerRequestDTO customerRequestDTO);
    public CustomerResponseDTO getCustomer(Long id);
}
