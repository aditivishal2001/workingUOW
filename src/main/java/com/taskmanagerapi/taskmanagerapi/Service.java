package com.taskmanagerapi.taskmanagerapi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;


public class Service
{

    public static void main(String[] args) {
        Service service = new Service();

        service.updateTaskForCompletion();

        int i =0;
    }
    public void updateTaskForCompletion()
    {

        SessionFactory factory;
        factory  = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;


        tx = session.beginTransaction();

        Task t1 = (Task)session.get(Task.class, 1);

        t1.setTask("test aditi");

        session.update(t1);

        tx.commit();

        session.close();

    }
}
