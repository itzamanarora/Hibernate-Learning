package com.learning.Models;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpDetails")
public class EmpDetails {

    @Id
    @UuidGenerator
    @Column(nullable=false, updatable=false)
    private UUID emp_id;

    @Column(nullable=false,length=50)
    private String emp_first_name;

    @Column(nullable=false,length=50)
    private String emp_last_name;

    @Column(nullable=false)
    private int emp_age;

    public EmpDetails() {
    }

    public EmpDetails(String emp_first_name, String emp_last_name, int emp_age){
        this.emp_first_name = emp_first_name;
        this.emp_last_name = emp_last_name;
        this.emp_age = emp_age;
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

    public UUID getEmp_id() {
        return emp_id;
    }

}
