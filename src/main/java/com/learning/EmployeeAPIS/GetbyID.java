package com.learning.EmployeeAPIS;

import org.hibernate.Session;

import com.learning.Models.EmpDetails;
import com.learning.SessionConfif;

public class GetbyID {
    private int emp_id;

    public GetbyID() {
        System.out.println("Enter valid Detail!");
    }

    public GetbyID(int emp_id) {
        this.emp_id = emp_id;
    }

    public void GetEmployeeById() {
        SessionConfif conf = new SessionConfif();
        Session session = conf.getSession();

        session.beginTransaction();

        EmpDetails empDetails = session.find(EmpDetails.class, emp_id);

            if (empDetails == null) {
                System.out.println("No Employee found with ID: " + emp_id);
            } else {
                System.out.println("ID: " + empDetails.getEmp_id() + ", First Name: " + empDetails.getEmp_first_name() + ", Last Name: " + empDetails.getEmp_last_name() + ", Age: " + empDetails.getEmp_age());
            }
        try {

        } catch (Exception e) {
            System.out.println("Something went wrong! " +e);
        } finally {
            // Close Session and SessionFactory
            conf.close();
        }
    }
}
