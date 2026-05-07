package com.infytel.dao;

import com.infytel.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("customerRepository")
public class CustomerDAOImpl implements CustomerDAO {
    private EntityManagerFactory entityManagerFactory;
    private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void insert(Customer customer) {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
    }

    @Override
    public int remove(Long phoneNo) {
        int result = 0;
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            Customer customer = entityManager.find(Customer.class, phoneNo);
            entityManager.remove(customer);
            result = 1;
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
        entityManager.clear();
        return result;
    }

    @Override
    public List<Customer> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("Select c from Customer c");
        return (List<Customer>) query.getResultList();
    }

    @Override
    public int update(Long phoneNo, String address) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Customer customer = entityManager.find(Customer.class, phoneNo);
        if(customer!=null){
            customer.setAddress(address);
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
            return 1;
        }else{
            return 0;
        }

    }
}
