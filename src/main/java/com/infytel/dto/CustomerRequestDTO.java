package com.infytel.dto;

import com.infytel.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {
    private Long phoneNumber;
    private String name;
    private Integer age;
    private Character gender;
    private String address;
    private Integer planId;

    public static Customer prepareCustomerEntity(CustomerRequestDTO customerRequestDTO)
    {
        Customer customerEntity = new Customer();
        customerEntity.setPhoneNumber(customerRequestDTO.getPhoneNumber());
        customerEntity.setName(customerRequestDTO.getName());
        customerEntity.setGender(customerRequestDTO.getGender());
        customerEntity.setAge(customerRequestDTO.getAge());
        customerEntity.setAddress(customerRequestDTO.getAddress());
        customerEntity.setPlanId(customerRequestDTO.getPlanId());
        return customerEntity;
    }
}