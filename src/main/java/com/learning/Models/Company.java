package com.learning.Models;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Company")
public class Company {

    @Id
    @UuidGenerator
    @Column(nullable=false, updatable=false)
    private UUID id;

    @Column(nullable=false,length=50)
    private String type;

    @Column(nullable=false, length=200)
    private String name;

    @Column(nullable=false, length=50)
    private String gstNumber;

    public Company() {
    }

    public Company(String gstNumber, String name, String type) {
        this.gstNumber = gstNumber;
        this.name = name;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    
}
