package com.infytel.service;

import com.infytel.dto.CustomerRequestDTO;
import com.infytel.dto.CustomerResponseDTO;
import com.infytel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public String createCustomer(CustomerRequestDTO customerRequestDTO) {
        return "";
    }

    @Override
    public CustomerResponseDTO getCustomer(Long id) {
        return null;
    }

//    // calls repository layer method to create customer
//    public String createCustomer(CustomerRequestDTO customerRequestDTO) {
//        return customerRepository.createCustomer(customerRequestDTO);
//    }
//    // calls repository layer method to fetch customers
//    public List<CustomerRequestDTO> fetchCustomer() {
//        return customerRepository.fetchCustomer();
//    }
//    // calls repository layer method to delete customer
//    public String deleteCustomer(long phoneNumber) {
//        return customerRepository.deleteCustomer(phoneNumber);
//    }
//    // calls repository layer method to update customer
//    public String updateCustomer(long phoneNumber, CustomerRequestDTO customerRequestDTO) {
//        return customerRepository.updateCustomer(phoneNumber, customerRequestDTO);
//    }
}
