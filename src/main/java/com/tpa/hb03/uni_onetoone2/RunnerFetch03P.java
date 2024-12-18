package com.tpa.hb03.uni_onetoone2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerFetch03P {
    public static void main(String[] args) {

        Configuration config=new Configuration().configure()//hibernate.cfg.xml
                .addAnnotatedClass(Car.class).addAnnotatedClass(Engine.class);

        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction trs= session.beginTransaction();

        // Tüm motorları (Engine) ve onlara bağlı arabaları (Car) listeleyen bir sorgu:
        String hql = "SELECT e FROM Engine e";
        List<Engine> engineList =session.createQuery(hql, Engine.class).getResultList();

        for (Engine e : engineList){

            System.out.println("Engine ID: " + e.getId()+" ,Name: "+ e.getEngineName()+
                    " ,Power: "+ e.getPower());

            if (e.getCar()!= null){
                System.out.println("Car model: "+ e.getCar().getModel());

                //Bu sorgunun tam tersini yapamayız. Çünkü burada Engine üzerinden Car a ulaşıyoruz,
                // Car üzerinden Engine ulaşım yok
                System.out.println("============================================");

               // engineName değeri "Iveco" olan bir motorun hangi arabaya bağlı olduğunu bul:

                String hql1 = "FROM Engine e WHERE e.engineName ='Iveco'";
                Engine engine = session.createQuery(hql1, Engine.class).uniqueResult();
                System.out.println(engine);
                System.out.println(engine.getCar());




            }
        }


            }
        }

