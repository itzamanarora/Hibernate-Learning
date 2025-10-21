package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionConfif {

    private final SessionFactory factory;
    private final Session session;

    // Constructor
    public SessionConfif() {
        // 1️⃣ Create Configuration object
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        // cfg.configure("hibernate.cfg.xml"); // Load configuration file

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties())
                .build();

        // 2️⃣ Build SessionFactory
        factory = cfg.buildSessionFactory(serviceRegistry);
        // 3️⃣ Open a session
        session = factory.openSession();
    }

    public Session getSession() {
        return session;
    }

    public void close() {
        session.close();
        factory.close();
    }
}
