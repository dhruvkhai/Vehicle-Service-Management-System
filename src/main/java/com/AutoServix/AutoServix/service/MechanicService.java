package com.AutoServix.AutoServix.service;

import com.AutoServix.AutoServix.models.Mechanic;
import com.AutoServix.AutoServix.repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MechanicService {
    @Autowired
    private MechanicRepository repo;

    public List<Mechanic> getAllMechanics() {
        return repo.findAll();
    }

    public Optional<Mechanic> getByid(Integer Id) {
        Optional<Mechanic> val = repo.findById(Id);
        return val;
    }

}
