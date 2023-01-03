package com.ironhack.laiatrailcat.controller;

import com.ironhack.laiatrailcat.model.Race;
import com.ironhack.laiatrailcat.repository.RaceRepository;
import com.ironhack.laiatrailcat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MainController {

    @Autowired
    RaceRepository raceRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/public")
    List<Race> getAllRaces(){ return raceRepository.findAll();}

}
