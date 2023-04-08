package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
