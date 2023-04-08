package com.javarush.ivannikov.dao;

import com.javarush.ivannikov.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
