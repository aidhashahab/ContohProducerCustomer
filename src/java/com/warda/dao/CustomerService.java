package com.warda.dao;

import com.warda.model.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomerService {

    @PersistenceUnit
    EntityManagerFactory emf;
    private EntityManager em;

    public CustomerService() {

    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public Customer save(Customer cus) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cus);
        em.getTransaction().commit();
        // Save employee
        return cus;
    }

    public List<Customer> findAll() {
        em = emf.createEntityManager();
        List<Customer> customers;
        customers = this.em.createNamedQuery("Customer.findAll").getResultList();
        return customers;
    }

    public Customer findById(Integer customerId) {
        em = emf.createEntityManager();
        return em.find(Customer.class, customerId);
    }
}
