package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store>{
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
