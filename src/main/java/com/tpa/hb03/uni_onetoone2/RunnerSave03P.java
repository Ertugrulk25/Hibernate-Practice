package com.tpa.hb03.uni_onetoone2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03P {
    public static void main(String[] args) {


    Car car1 = new Car(1001,"Honda",2024);
    Car car2 = new Car(1002,"Mercedes",2020);
    Car car3 = new Car(1003,"Audi",2021);
    Car car4 = new Car(1004,"Fiat",2022);

    Engine engine1 = new Engine(100,"Iveco",300);
    Engine engine2 = new Engine(101,"Rolls Royce",300);
    Engine engine3 = new Engine(102,"Lamborghini",300);
    Engine engine4 = new Engine(103,"Tofaş",300);

    engine1.setCar(car1);
    engine2.setCar(car2);
    engine3.setCar(car3);
    engine4.setCar(car4);


    Configuration config=new Configuration().configure()//hibernate.cfg.xml
            .addAnnotatedClass(Car.class).addAnnotatedClass(Engine.class);

    SessionFactory sessionFactory= config.buildSessionFactory();
    Session session=sessionFactory.openSession();
    Transaction trs= session.beginTransaction();


    session.save(car1);
    session.save(car2);
    session.save(car3);
    session.save(car4);

    session.save(engine1);
    session.save(engine2);
    session.save(engine3);
    session.save(engine4);

    trs.commit();
    session.close();
    sessionFactory.close();

}
}