package com.learning.Models;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="EmpDetails")
public class EmpDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //Transient fields are not persisted in the database
    @Transient // Not a DB Column

    @UuidGenerator
    @Column(nullable=false, updatable=false)
    private UUID uuid;

    @Column(nullable=false,length=50)
    private String emp_first_name;

    @Column(nullable=false,length=50)
    private String emp_last_name;

    @Column(nullable=false)
    private int emp_age;

    @Column(nullable=false)
    private String emp_created_at = java.time.LocalDateTime.now().toString();

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

    public UUID getUUID() {
        return uuid;
    }

    public String getEmp_created_at() {
        return emp_created_at;
    }
    public long getEmp_id() {
        return id;
    }
    public String getCreatingTime() {
        return emp_created_at;
    }
}
