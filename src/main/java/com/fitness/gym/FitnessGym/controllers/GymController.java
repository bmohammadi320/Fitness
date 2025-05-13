package com.fitness.gym.FitnessGym.controllers;

import com.fitness.gym.FitnessGym.dtos.GymDto;
import com.fitness.gym.FitnessGym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gym")
public class GymController {
    @Autowired
    private GymService gymService;

    @PostMapping
    public ResponseEntity<GymDto> addGym(@RequestBody GymDto gymDto){
        return new ResponseEntity<>(gymService.createGym(gymDto), HttpStatus.CREATED);
    }
}
