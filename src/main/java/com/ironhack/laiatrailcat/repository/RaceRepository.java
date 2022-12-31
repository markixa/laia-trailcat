package com.ironhack.laiatrailcat.repository;

import com.ironhack.laiatrailcat.model.Race;
import com.ironhack.laiatrailcat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RaceRepository extends JpaRepository <Race, Long> {
    Optional<Race> findByName(String name);
}
