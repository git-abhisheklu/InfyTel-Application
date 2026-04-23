package com.infytel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {
    long phoneNo;
    String name;
    String email;
    int age;
    char gender;
    List<FriendFamilyDTO> friendAndFamily;
    String password;
    String address;
    PlanRequestDTO currentPlan;
}