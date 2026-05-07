package com.infytel.controller;

import com.infytel.dto.CustomerDTO;
import com.infytel.dto.UpdateCustomerDTO;
import com.infytel.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerServiceImpl customerServiceImpl;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<String> createCustomer(@RequestBody CustomerDTO customerDTO) {
        try {
            customerServiceImpl.create(customerDTO);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
        return new ResponseEntity<>("Record has been added successfully...", HttpStatus.OK);
    }

    @GetMapping(produces = "application/json")
    public List<CustomerDTO> fetchCustomers() {
        return customerServiceImpl.getAll();
    }

    @PatchMapping(value = "/{phoneNumber}")
    public String updateCustomer(@PathVariable Long phoneNumber, @RequestBody UpdateCustomerDTO updateCustomerDTO) {
        return customerServiceImpl.updateByPhoneNo(phoneNumber, updateCustomerDTO);
    }

    @DeleteMapping("/{phoneNumber}")
    public String deleteCustomer(@PathVariable Long phoneNumber) {
        int remove = customerServiceImpl.remove(phoneNumber);
        return "Customer has been removed: " + remove;
    }
}
