package com.AutoServix.AutoServix.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Service_Records")
public class Vendor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer serviceid;

    @ManyToOne
    @JoinColumn(name="Customer_Id", nullable=false)

    private Integer customerid;
    private String AISummary;
    private Integer Health;

    @ManyToOne
    @JoinColumn(name="Mechanic_Id", nullable=false)
    private Integer Mechanic_Id;

    public Integer getServiceid() {
        return serviceid;
    }


    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getAISummary() {
        return AISummary;
    }

    public void setAISummary(String aISummary) {
        AISummary = aISummary;
    }

    public Integer getHealth() {
        return Health;
    }

    public void setHealth(Integer health) {
        Health = health;
    }

    public Integer getMechanic_Id() {
        return Mechanic_Id;
    }

    public void setMechanic_Id(Integer mechanic_Id) {
        Mechanic_Id = mechanic_Id;
    }




}