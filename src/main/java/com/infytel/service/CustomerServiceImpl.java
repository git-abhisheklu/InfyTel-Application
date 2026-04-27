package com.infytel.service;

import com.infytel.dao.CustomerDAO;
import com.infytel.dao.CustomerDAOImpl;
import com.infytel.dto.CustomerRequestDTO;
import com.infytel.dto.CustomerResponseDTO;
import com.infytel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAOImpl customerDAO;

    @Override
    public void createCustomer(CustomerRequestDTO customerRequestDTO) {
        customerDAO.insert(CustomerRequestDTO.prepareCustomerEntity(customerRequestDTO));
    }

    @Override
    public CustomerResponseDTO getCustomer(Long id) {
        return null;
    }

    @Override
    public int remove(Long phoneNo) {
        return customerDAO.remove(phoneNo);
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
