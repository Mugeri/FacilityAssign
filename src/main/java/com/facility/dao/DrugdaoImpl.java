package com.facility.dao;

import com.facility.models.Drugs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 5/7/2015.
 */
public class DrugdaoImpl implements Drugdao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Drugs drugs) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drugs);
        tx.commit();
        Serializable id = session.getIdentifier(drugs);
        session.close();
        return (Integer) id;
    }

    @Override
    public List<Drugs> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drugs> drugsList = session.createQuery("from Drugs").list();
        session.close();
        return drugsList;
    }

}
