package com.tpa.basicannotations2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerFetch1 {
    public static void main(String[] args) {

        Configuration config = new Configuration().configure().addAnnotatedClass(Fruits.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        System.out.println("----------- GET ----------------");

        // get methodunu id ile veri çekerken kullanabilriz.
        Fruits fruit = session.get(Fruits.class,101);
        System.out.println(fruit);

        Fruits fruit1= session.get(Fruits.class,102);
        System.out.println(fruit1);

        Fruits fruit2 = session.get(Fruits.class,103);
        System.out.println(fruit2);

        Fruits fruit3 = session.get(Fruits.class,104);
        System.out.println(fruit3);

        Fruits fruit4 = session.get(Fruits.class,105);
        System.out.println(fruit4);

        Fruits fruit5 = session.get(Fruits.class,106);
        System.out.println(fruit5);

        Fruits fruit6 = session.get(Fruits.class,107);
        System.out.println(fruit6);

        Fruits fruit7 = session.get(Fruits.class,108);
        System.out.println(fruit7);

        Fruits fruit8 = session.get(Fruits.class,109);
        System.out.println(fruit8);

        Fruits fruit9 = session.get(Fruits.class,110);
        System.out.println(fruit9);

        System.out.println("------------- SQL ----------------");

        String sql1 = "SELECT * FROM t_fruits WHERE id = 102";
        Object[] fruits0 = (Object[]) session.createSQLQuery(sql1).uniqueResult();
        System.out.println(Arrays.toString(fruits0));

        String sql2 = "SELECT * FROM t_fruits WHERE id= 103";
        Object[] fruit10= (Object[]) session.createSQLQuery(sql2).uniqueResult();
        System.out.println(Arrays.toString(fruit10));

        String sql3= "SELECT * FROM t_fruits WHERE name = 'apple' ";
        Object[] fruit11= (Object[]) session.createSQLQuery(sql3).uniqueResult();
        System.out.println(Arrays.toString(fruit11));

        String sql4 = "SELECT * FROM t_fruits WHERE id = 105";
        Object[] fruit12 = (Object[]) session.createSQLQuery(sql4).uniqueResult();
        System.out.println(Arrays.toString(fruit12));

        String sql5 = "SELECT * FROM t_fruits WHERE  id = 107";
        Object [] fruit13 = (Object[]) session.createSQLQuery(sql5).uniqueResult();
        System.out.println(Arrays.toString(fruit13));

        String sql6 = "SELECT * FROM t_fruits WHERE id = 109";
        Object[] fruit14 = (Object[]) session.createSQLQuery(sql6).uniqueResult();
        System.out.println(Arrays.toString(fruit14));




        System.out.println("--------- HQL -----------------");

        String hql1 = "FROM Fruits WHERE id = 105";
        Fruits fruits = session.createQuery(hql1, Fruits.class).uniqueResult();
        System.out.println(fruits);

        String hql2 = "FROM Fruits WHERE productionSite = 'Washington'";
        Fruits fruits1 = session.createQuery(hql2, Fruits.class).uniqueResult();
        System.out.println(fruits1);

        String hql3 = "FROM Fruits  WHERE name ='plum'";
        Fruits fruits2= session.createQuery(hql3, Fruits.class).uniqueResult();
        System.out.println(fruits2);

        System.out.println("***************************************************");
        String hql4 = "FROM Fruits WHERE kg = 500";
        List<Fruits> fruits3= session.createQuery(hql4, Fruits.class).getResultList();

       if (fruits3.isEmpty()){
           System.out.println("500 kg lik ürün yok");

       }else {
           for (Fruits fr: fruits3){
               System.out.println(fr);
           }
       }









    }
}
