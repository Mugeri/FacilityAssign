package com.facility.dao;

import com.facility.dao.Patientdao;
import com.facility.models.Patients;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 5/6/2015.
 */
public class PatientdaoImpl implements Patientdao {


        @Autowired
        SessionFactory sessionFactory;

        @Transactional
        @Override
        public int insertRow(Patients patients) {
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(patients);
            tx.commit();
            Serializable id = session.getIdentifier(patients);
            session.close();
            return (Integer) id;
        }

        @Override
        public List<Patients> getList() {
            Session session = sessionFactory.openSession();
            @SuppressWarnings("unchecked")
            List<Patients> patientsList = session.createQuery("from ").list();
            session.close();
            return patientsList;
        }

        @Override
        public int updateRow(Patients patients) {
            return 0;
        }

        @Override
        public int deleteRow(int id) {
            return 0;
        }
    }

