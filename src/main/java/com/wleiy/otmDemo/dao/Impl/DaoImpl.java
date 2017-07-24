package com.wleiy.otmDemo.dao.Impl;

import com.wleiy.otmDemo.dao.IBaseDao;
import com.wleiy.otmDemo.entity.Grade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wl_wl on 2017/7/24 0024.
 */
@Repository(value = "dao")
public class DaoImpl implements IBaseDao {
    private Configuration configuration = null;
    private SessionFactory sessionFactory = null;
    private Session session = null;
    private Transaction tx = null;

    public DaoImpl() {
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();

    }

    public List<Grade> searchGrade(){
        List<Grade> gradeLists = session.createQuery("from Grade ").list();

        return gradeLists;

    }


}
