package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Feature;
import org.hibernate.SessionFactory;

public class FeatureDAO extends GenericDAO<Feature>{
    public FeatureDAO(SessionFactory sessionFactory) {
        super(Feature.class, sessionFactory);
    }
}