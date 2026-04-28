package com.AutoServix.AutoServix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AutoServix.AutoServix.models.Vendor;

public interface VendorRepository extends JpaRepository<Vendor , Integer> {

    List<Vendor> findbyMechanical_Id();

    List<Vendor> findbyService_Id();

    List<Vendor> findbyCustomer_Id();

    List<Vendor> findAll();


}