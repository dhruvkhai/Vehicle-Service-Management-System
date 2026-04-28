package com.AutoServix.AutoServix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Models.ServiceModel;
import Repo.ServiceRepository;

public class VendorService {

    @Autowired
    private ServiceRepository servicerepository;

    public List<ServiceModel> GetallServices() {
        return servicerepository.findAll();
    }

    public List<ServiceModel> Getalluser(Integer Customer_Id){
        return servicerepository.findbyCustomer_Id();

    }
    public List<ServiceModel> getServiceById(Integer Service_Id){
        return servicerepository.findbyService_Id();

    }

    public List<ServiceModel> Getallmechicalids (Integer Mechanical_Id){
        return servicerepository.findbyMechanical_Id();

    }


}

}