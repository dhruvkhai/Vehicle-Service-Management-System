package com.AutoServix.AutoServix.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "mechanic")
public class Mechanic {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mechId;

    @Column(name = "mechName", nullable = false)
    private String mechName;
    private String mechDescription;

    @ManyToOne
    @JoinColumn(name = "user_Id")  // its a foreign key
    private User user;   // class is not imported yet
    private ArrayList<String> fault;
    private int noOfServices;

    public Mechanic() {}

    public Mechanic(String mechName, String mechDescription, User user,  ArrayList<String> fault, int noOfServices) {
        this.mechName = mechName;
        this.mechDescription = mechDescription;
        this.user = user;
        this.fault = fault;
        this.noOfServices = noOfServices;
    }

    public  Integer getMechId() {
        return mechId;
    }

    public void setMechId(Integer mechId) {
        this.mechId = mechId;
    }

    public String getMechDescription() {
        return mechDescription;
    }

    public void setMechDescription(String mechDescription) {
        this.mechDescription = mechDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<String> getFault() {
        return fault;
    }

    public void setFault(ArrayList<String> fault) {
        this.fault = fault;
    }

    public int getNoOfServices() {
        return noOfServices;
    }

    public void setNoOfServices(int noOfServices) {
        this.noOfServices = noOfServices;
    }
}
