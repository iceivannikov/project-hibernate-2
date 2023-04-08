package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAnyUnreturnedRental() {
        Query<Rental> query = getCurrentSession()
                .createQuery("select r from Rental r where returnDate is null", Rental.class);
        query.setMaxResults(1);
        return query.getSingleResult();

    }
}
