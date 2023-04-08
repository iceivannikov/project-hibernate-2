package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Rating;
import org.hibernate.SessionFactory;

public class RatingDAO extends GenericDAO<Rating> {
    public RatingDAO(SessionFactory sessionFactory) {
        super(Rating.class, sessionFactory);
    }
}
