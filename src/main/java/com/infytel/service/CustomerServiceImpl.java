package com.infytel.service;

import com.infytel.dao.CustomerDAO;
import com.infytel.dto.CustomerDTO;
import com.infytel.dto.UpdateCustomerDTO;
import com.infytel.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDAO customerDAO;

    @Override
    public void create(CustomerDTO customerDTO) {
        customerDAO.insert(CustomerDTO.prepareCustomerEntity(customerDTO));
    }

    @Override
    public CustomerDTO getByPhoneNo(Long phoneNo) {
        return null;
    }

    @Override
    public int remove(Long phoneNo) {
        return customerDAO.remove(phoneNo);
    }

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> customerList = customerDAO.getAll();
        return List.of();
    }

    @Override
    public String updateByPhoneNo(Long phoneNo, UpdateCustomerDTO updateCustomerDTO) {
        int result = customerDAO.update(phoneNo, updateCustomerDTO.getAddress());
        if (result == 1) {
            return "Customer has been updated successfully.";
        } else {
            return "No customer found with the given phone number.";
        }
    }
}
