package com.learning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpDetails")
public class EmpDetails {

    @Id
    private int emp_id;
    private String emp_first_name;
    private String emp_last_name;
    private int emp_age;

    public EmpDetails() {
    }

    public EmpDetails(int emp_id, String emp_first_name, String emp_last_name, int emp_age){
        this.emp_id = emp_id;
        this.emp_first_name = emp_first_name;
        this.emp_last_name = emp_last_name;
        this.emp_age = emp_age;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_first_name() {
        return emp_first_name;
    }

    public void setEmp_first_name(String emp_first_name) {
        this.emp_first_name = emp_first_name;
    }

    public String getEmp_last_name() {
        return emp_last_name;
    }

    public void setEmp_last_name(String emp_last_name) {
        this.emp_last_name = emp_last_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

}
