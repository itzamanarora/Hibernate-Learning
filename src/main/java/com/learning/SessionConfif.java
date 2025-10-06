package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionConfif {

    private final SessionFactory factory;
    private final Session session;

    
    // Constructor
    public SessionConfif() {
        // 1️⃣ Create Configuration object
        Configuration cfg  = new Configuration();
        cfg.configure("hibernate.cfg.xml");  // Load configuration file

        // 2️⃣ Build SessionFactory
        factory = cfg.buildSessionFactory();
        // 3️⃣ Open a session
        session = factory.openSession();
    }

    public Session getSession() {
        return session;
    }

    public void close(){
        session.close();
        factory.close();
    }
}
