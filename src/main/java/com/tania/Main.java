package com.tania;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = (new Configuration()).configure().buildSessionFactory();

        int i = 8;
        i = ++i + i++;
        System.out.println(i);
    }
}
