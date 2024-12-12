package com.tpa.hb02.embeddable2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02P {
    public static void main(String[] args) {

        Student02P student1 = new Student02P(1001,"Hakan","Can",99);
        Student02P student2 = new Student02P(1002,"Ali","Han",99);
        Student02P student3 = new Student02P(1003,"Veli","Kan",99);

        Address02P address1= new Address02P("Orange Street","London","UK","1234");
        Address02P address2= new Address02P("Apple Street","NewYork","USA","9876");

        student1.setAddress(address1);
        student2.setAddress(address2);
        student3.setAddress(address1);


        Configuration config = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Student02P.class);

        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction trs = session.beginTransaction();


        session.save(student1);
        session.save(student2);
        session.save(student3);

        trs.commit();
        session.close();
        sessionFactory.close();
    }
}
