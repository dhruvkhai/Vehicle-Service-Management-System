package com.AutoServix.AutoServix.controller;

import com.AutoServix.AutoServix.models.Mechanic;
import com.AutoServix.AutoServix.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
    @Autowired
    private MechanicService serv;

    @GetMapping("/all")
    public ResponseEntity<List<Mechanic>> getAllMech() {
        return ResponseEntity.ok(serv.getAllMechanics());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Mechanic>> getMechanicById(@PathVariable Integer id) {
        return ResponseEntity.ok(serv.getByid(id));
    }

    @GetMapping("/name/{mechName}")
    public ResponseEntity<List<Mechanic>> getByName(@PathVariable String mechName) {
        return ResponseEntity.ok(serv.getbyName(mechName));
    }

    @GetMapping("/username/{userName}")
    public ResponseEntity<List<Mechanic>> getByUserName(@PathVariable String userName) {
        return ResponseEntity.ok(serv.getByUserName(userName));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Mechanic>> getByUserId(@PathVariable Integer userId) {
        return ResponseEntity.ok(serv.getByUserId(userId));
    }

    @PostMapping("/add")
    public ResponseEntity<Mechanic> addMechanic(@RequestBody Mechanic mechanic) {
        return ResponseEntity.ok(serv.addMechanic(mechanic));
    }
}
