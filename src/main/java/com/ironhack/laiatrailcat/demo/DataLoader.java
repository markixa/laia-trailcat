package com.ironhack.laiatrailcat.demo;

import com.ironhack.laiatrailcat.model.Race;
import com.ironhack.laiatrailcat.model.User;
import com.ironhack.laiatrailcat.repository.RaceRepository;
import com.ironhack.laiatrailcat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
@Log
@Profile("demo")
public class DataLoader {

    private final UserRepository userRepository;
    private final RaceRepository raceRepository;
    private final PasswordEncoder passwordEncoder;

    @EventListener(ApplicationReadyEvent.class)
    public void loadDemoData(){
        log.info("Starting demo user loading...");
        User user1 = new User("johndoe", passwordEncoder.encode("doepass"), "ROLE_USER");
        userRepository.save(user1);
        log.info("user  " + user1.getUsername() + " created succesfully" );
        User admin1 = new User("admin", passwordEncoder.encode("admin"), "ROLE_ADMIN");
        userRepository.save(admin1);
        log.info("user  " + user1.getUsername() + " created succesfully" );
        log.info("Starting demo races loading...");
        Race race1 = new Race("Ultra Montseny", 80, 4868, "La Garriga", LocalDate.of(2023,04,01));
        raceRepository.save(race1);
        log.info("race  " + race1.getName() + " created succesfully" );
        Race race2 = new Race("Cursa Lo Meló", 15, 600, "Artesa de Segre", LocalDate.of(2023,05,01));
        raceRepository.save(race2);
        log.info("race  " + race2.getName() + " created succesfully" );
        Race race3 = new Race("La Ribalera", 42, 3090, "Tírvia", LocalDate.of(2023,06,18));
        raceRepository.save(race3);
        log.info("race  " + race3.getName() + " created succesfully" );
        Race race4 = new Race("GARMIN Epic Trail", 55, 4100, "Barruera", LocalDate.of(2023,07,01));
        raceRepository.save(race4);
        log.info("race  " + race4.getName() + " created succesfully" );
        Race race5 = new Race("Aran by UTMB", 162, 10700, "Vielha", LocalDate.of(2023,07,06));
        raceRepository.save(race5);
        log.info("race  " + race5.getName() + " created succesfully" );
        Race race6 = new Race("Montsec Ultra Trail", 85, 4500, "Áger", LocalDate.of(2023,10,29));
        raceRepository.save(race6);
        log.info("race  " + race6.getName() + " created succesfully" );
        log.info("Finished demo data loading.");
    }


    //"yyyy-MM-dd"
}
