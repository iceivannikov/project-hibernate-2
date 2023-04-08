package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
