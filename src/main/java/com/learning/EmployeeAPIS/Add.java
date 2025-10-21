package com.learning.EmployeeAPIS;

import org.hibernate.Session;

import com.learning.Models.EmpDetails;
import com.learning.SessionConfif;

public class Add {

    private String emp_first_name;
    private String emp_last_name;
    private int emp_age;
    
    public Add() {
        System.out.println("Enter valid Employee Details to Add!");
    }

    public Add(String emp_first_name, String emp_last_name, int emp_age) {
        this.emp_first_name = emp_first_name;
        this.emp_last_name = emp_last_name;
        this.emp_age = emp_age;
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public void AddEmployeeDetails() {

        if (emp_first_name.isEmpty() || emp_last_name.isEmpty() || emp_age <= 0) {
            System.out.println("Please provide valid Employee Details!");
            return;
        }

        SessionConfif conf = new SessionConfif();
        Session session = conf.getSession();

        try {
            session.beginTransaction();

            EmpDetails obj3 = new EmpDetails();
            obj3.setEmp_first_name(emp_first_name);
            obj3.setEmp_last_name(emp_last_name);
            obj3.setEmp_age(emp_age);

            // Save student object to DB
            session.persist(obj3);

            // Commit transaction
            session.getTransaction().commit();
            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            System.out.println("Something went wrong! "+e);

        } finally {
            // Close Session and SessionFactory
            conf.close();
        }

    }
}
