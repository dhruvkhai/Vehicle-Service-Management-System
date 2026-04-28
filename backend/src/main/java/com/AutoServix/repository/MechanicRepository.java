package com.AutoServix.AutoServix.repository;

import com.AutoServix.AutoServix.models.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MechanicRepository extends JpaRepository<Mechanic, Integer> {
    List<Mechanic> findByMechName(String mechName);

    List<Mechanic> findByUserUserName(String userName);

    List<Mechanic> findByUserUserId(Integer userId);
}
