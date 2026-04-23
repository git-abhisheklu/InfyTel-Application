package com.infytel.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository{
//    List<CustomerRequestDTO> customers = null;
//    // Populating CustomerDTO - hard-coded
//    @PostConstruct
//    public void initializer() {
//        CustomerRequestDTO customerRequestDTO = new CustomerRequestDTO();
//        PlanDTO planDTO = new PlanDTO();
//        planDTO.setPlanId(1);
//        planDTO.setPlanName("Simple");
//        planDTO.setLocalRate(3);
//        planDTO.setNationalRate(5);
//        customerRequestDTO.setAddress("Chennai");
//        customerRequestDTO.setAge(18);
//        customerRequestDTO.setCurrentPlan(planDTO);
//        customerRequestDTO.setGender('m');
//        customerRequestDTO.setName("Jack");
//        customerRequestDTO.setEmail("Jack@infy.com");
//        customerRequestDTO.setPassword("ABC@123");
//        customerRequestDTO.setPhoneNo(9951212222l);
//        List<FriendFamilyDTO> friendAndFamily = new ArrayList<>();
//        friendAndFamily.add(new FriendFamilyDTO(customerRequestDTO.getPhoneNo(), 800000145));
//        friendAndFamily.add(new FriendFamilyDTO(customerRequestDTO.getPhoneNo(), 700000145));
//        customerRequestDTO.setFriendAndFamily(friendAndFamily);
//        customers = new ArrayList<>();
//        customers.add(customerRequestDTO);
//    }
//    // creates customer
//    public String createCustomer(CustomerRequestDTO customerRequestDTO) {
//        customers.add(customerRequestDTO);
//        return "Customer with" + customerRequestDTO.getPhoneNo() + "added successfully";
//    }
//    // fetches customers
//    public List<CustomerRequestDTO> fetchCustomer() {
//        return customers;
//    }
//    // deletes customers
//    public String deleteCustomer(long phoneNumber) {
//        String response = "Customer of:" + phoneNumber + "\t does not exist";
//        for (CustomerRequestDTO customer : customers) {
//            if (customer.getPhoneNo() == phoneNumber) {
//                customers.remove(customer);
//                response = customer.getName() + "of phoneNumber" + customer.getPhoneNo()
//                        + "\t got deleted successfully";
//                break;
//            }
//        }
//        return response;
//    }
//    // updates customers
//    public String updateCustomer(long phoneNumber, CustomerRequestDTO customerRequestDTO) {
//        String response = "Customer of:" + phoneNumber + "\t does not exist";
//        for (CustomerRequestDTO customer : customers) {
//            if (customer.getPhoneNo() == phoneNumber) {
//                if (customerRequestDTO.getName() != null)
//                    customer.setName(customerRequestDTO.getName());
//                if (customerRequestDTO.getAddress() != null)
//                    customer.setAddress(customerRequestDTO.getAddress());
//                if (customerRequestDTO.getPassword() != null)
//                    customer.setPassword(customerRequestDTO.getPassword());
//                customers.set(customers.indexOf(customer), customer);
//                response = "Customer of phoneNumber" + customer.getPhoneNo() + "\t got updated successfully";
//                break;
//            }
//        }
//        return response;
//    }
}
