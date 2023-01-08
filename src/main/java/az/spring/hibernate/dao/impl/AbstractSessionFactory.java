package az.spring.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractSessionFactory {
    @Autowired
    private SessionFactory sessionFactory;
    protected Session getSession(){
        return  sessionFactory.getCurrentSession();
    }
}
