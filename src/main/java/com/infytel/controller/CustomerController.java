package com.infytel.controller;

import com.infytel.dto.CustomerRequestDTO;
import com.infytel.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping(consumes="application/json")
    public ResponseEntity<String> createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO)
    {
        customerServiceImpl.createCustomer(customerRequestDTO);
        return new ResponseEntity<>("Please check console...", HttpStatus.OK);
    }

//    @GetMapping(produces="application/json")
//    public  List<CustomerRequestDTO> fetchCustomer()
//    {
//        return customerServiceImpl.fetchCustomer();
//    }

//    @PutMapping
//    public String updateCustomer()
//    {
//        return "customer details updated successfully";
//    }

    @DeleteMapping
    public String deleteCustomer(Long phoneNumber)
    {
        int remove = customerServiceImpl.remove(phoneNumber);
        return "Customer has been removed: " + remove;
    }
}
