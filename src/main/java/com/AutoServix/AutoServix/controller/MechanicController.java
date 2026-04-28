package com.AutoServix.AutoServix.controller;

import com.AutoServix.AutoServix.models.Mechanic;
import com.AutoServix.AutoServix.service.MechanicService;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
    @Autowired
    private MechanicService serv;

    @GetMapping("/all")
    public ResponseEntity<List<Mechanic>> getAllMech() {
        return ResponseEntity.ok(serv.getAllMechanics());
    }

    @GetMapping("/{id}")
    pubclic ResponseEntity<Optional<Mechanic>> getbyID(@PathVariable Integer Id){
        return ResponseEntity.ok(serv.getByid(Id));
    }

    @GetMapping("/all")

    @GetMapping("/all")

    @GetMapping("/all")

    @PostMapping("/all")
}
