package com.learning;

import org.hibernate.Session;

public class Add {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main( String[] args ) {

        // 1️⃣ Create Configuration object
        // Configuration cfg = new Configuration();
        // cfg.configure("hibernate.cfg.xml");  // make sure hibernate.cfg.xml is in src/main/resources

        // 2️⃣ Build SessionFactory from Configuration
        // SessionFactory factory = cfg.buildSessionFactory();

        // 3️⃣ Open a Session
        // Session session = factory.openSession();

        SessionConfif conf = new SessionConfif();
        Session session = conf.getSession();

        try {
            // 4️⃣ Start Transaction
            session.beginTransaction();

            EmpDetails obj3 = new EmpDetails();
            obj3.setEmp_id(5);
            obj3.setEmp_first_name("Vievk");
            obj3.setEmp_last_name("Gautham");
            obj3.setEmp_age(24);

            // 5️⃣ Save student object to DB
            session.persist(obj3);

            // 6️⃣ Commit transaction
            session.getTransaction().commit();
            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            System.out.println("Something went wrong! "+e);

        } finally {
            // 7️⃣ Close Session and SessionFactory
            conf.close();
        }

    }
}
