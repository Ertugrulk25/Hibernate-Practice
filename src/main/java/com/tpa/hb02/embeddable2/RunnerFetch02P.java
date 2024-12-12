package com.tpa.hb02.embeddable2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02P {

    public static void main(String[] args) {

        Configuration config = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student02P.class);

        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //id si 1003 olan öğrenciyi getir

        Student02P student = session.get(Student02P.class,1003);
        System.out.println(student);

        //adres
        System.out.println(student.getAddress());
    }
}
