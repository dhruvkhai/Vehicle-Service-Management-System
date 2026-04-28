package com.AutoServix.AutoServix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.ServiceModel;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/Service")
@RestController
public class VendorController {

    @GetMapping("{/getall}")
    public List<ServiceModel> Getallservice(){
        return;

    }
    @GetMapping("{/Customer_Id}")
    public List<ServiceModel> GetCustomerid(){
        return;
    }

    @GetMapping("{/Service_Id}")
    public List<ServiceModel> GetServiceid(){
        return;
    }
    @GetMapping("{/Mechanic_Id}")
    public List<ServiceModel> Getmechanicalid(){
        return;
    }
}
