package com.AutoServix.AutoServix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.AutoServix.AutoServix.models.Vendor;
import com.AutoServix.AutoServix.repository.VendorRepository;



public class VendorService {

    @Autowired
    private VendorRepository vendorRepo;

    public List<Vendor> GetallServices() {
        return vendorRepo.findAll();
    }

    public List<Vendor> Getalluser(Integer Customer_Id){
        return vendorRepo.findbyCustomer_Id();

    }
    public List<Vendor> getServiceById(Integer Service_Id){
        return vendorRepo.findbyService_Id();

    }

    public List<Vendor> Getallmechicalids (Integer Mechanical_Id){
        return vendorRepo.findbyMechanical_Id();

    }

    public List<Vendor> getAllServices() {

        return vendorRepo.findAll();
    }

    public List<Vendor> getByCustomerId(Integer id) {

        return vendorRepo.findbyCustomer_Id();
    }

    public List<Vendor> getByServiceId(Integer id) {

        return vendorRepo.findbyService_Id();
    }

    public  List<Vendor> getByMechanicId( Integer id) {
        return vendorRepo.findbyMechanical_Id();
    }
}