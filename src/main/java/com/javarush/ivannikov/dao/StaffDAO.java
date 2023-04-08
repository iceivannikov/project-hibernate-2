package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}

