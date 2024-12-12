package com.tpa.basicannotations2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave1 {
    public static void main(String[] args) {
        Fruits fruits1 = new Fruits();
            fruits1.setId(101);
            fruits1.setName("apple");
            fruits1.setProductionSite("California");
            fruits1.setKg(600);

        Fruits fruits2 = new Fruits();
        fruits2.setId(102);
        fruits2.setName("orange");
        fruits2.setProductionSite("Washington");
        fruits2.setKg(900);

        Fruits fruits3 = new Fruits();
        fruits3.setId(103);
        fruits3.setName("grape");
        fruits3.setProductionSite("Rome");
        fruits3.setKg(1000);

        Fruits fruits4 = new Fruits();
        fruits4.setId(104);
        fruits4.setName("olive");
        fruits4.setProductionSite("Nicea");
        fruits4.setKg(400);

        Fruits fruits5 = new Fruits();
        fruits5.setId(105);
        fruits5.setName("tomato");
        fruits5.setProductionSite("Sevilla");
        fruits5.setKg(900);

        Fruits fruits6 = new Fruits();
        fruits6.setId(106);
        fruits6.setName("watermelon");
        fruits6.setProductionSite("Tahran");
        fruits6.setKg(2000);

        Fruits fruits7 = new Fruits();
        fruits7.setId(107);
        fruits7.setName("mandarin");
        fruits7.setProductionSite("Shangai");
        fruits7.setKg(500);

        Fruits fruits8 = new Fruits();
        fruits8.setId(108);
        fruits8.setName("cherry");
        fruits8.setProductionSite("Osaka");
        fruits8.setKg(500);

        Fruits fruits9 = new Fruits();
        fruits9.setId(109);
        fruits9.setName("nut");
        fruits9.setProductionSite("Napoli");
        fruits9.setKg(500);

        Fruits fruits10 = new Fruits();
        fruits10.setId(110);
        fruits10.setName("plum");
        fruits10.setProductionSite("Berlin");
        fruits10.setKg(500);

        Configuration config = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Fruits.class);

        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction trs = session.beginTransaction();

        session.save(fruits1);
        session.save(fruits2);
        session.save(fruits3);
        session.save(fruits4);
        session.save(fruits5);
        session.save(fruits6);
        session.save(fruits7);
        session.save(fruits8);
        session.save(fruits9);
        session.save(fruits10);

        trs.commit();
        session.close();
        sessionFactory.close();







    }
}
