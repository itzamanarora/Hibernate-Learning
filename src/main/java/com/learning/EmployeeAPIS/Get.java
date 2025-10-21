package com.learning.EmployeeAPIS;

import java.util.List;

import org.hibernate.Session;

import com.learning.Models.EmpDetails;
import com.learning.SessionConfif;

public class Get {
    public void GetAllEmployeeDetails() {
        SessionConfif conf = new SessionConfif();
        Session session = conf.getSession();

        try {
            session.beginTransaction();
            // Get Employee Details
            List<EmpDetails> empList = session.createQuery("from EmpDetails", EmpDetails.class).list();
            for (EmpDetails emp : empList) {
                System.out.println("ID: " + emp.getEmp_id() + ", First Name: " + emp.getEmp_first_name() + ", Last Name: " + emp.getEmp_last_name() + ", Age: " + emp.getEmp_age());
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Something went wrong! "+e);

        } finally {
            // Close Session and SessionFactory
            conf.close();
        }
    }
}
