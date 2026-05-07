package com.infytel.service;

import com.infytel.dao.CustomerDAO;
import com.infytel.dto.CustomerDTO;
import com.infytel.dto.CustomerResponseDTO;
import com.infytel.dto.UpdateCustomerDTO;
import com.infytel.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<CustomerResponseDTO> getAll() {
        List<Customer> customerList = customerDAO.getAll();
        List<CustomerResponseDTO> customerResponseDTOList = new ArrayList<>();
        if (customerList != null){
            CustomerResponseDTO customerResponseDTOS = null;
            for(Customer customer:customerList){
                customerResponseDTOS = Customer.prepareDTO(customer);
                customerResponseDTOList.add(customerResponseDTOS);
            }
        }
        return customerResponseDTOList;
    }

    @Override
    public String updateByPhoneNo(Long phoneNo, UpdateCustomerDTO updateCustomerDTO) {
        int result= customerDAO.update(phoneNo, updateCustomerDTO.getAddress(),updateCustomerDTO.getName());
        if (result == 1) {
            return "Customer has been updated successfully.";
        }else if(result == 2){
            return "Customer details are not updated as fields provided are null or empty.";
        }else {
            return "No customer found with the given phone number.";
        }
    }
}
