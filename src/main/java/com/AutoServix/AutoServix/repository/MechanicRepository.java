package com.AutoServix.AutoServix.repository;

import com.AutoServix.AutoServix.models.Mechanic;
import com.AutoServix.AutoServix.service.MechanicService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MechanicRepository extends JpaRepository<Mechanic, Integer> {
}
