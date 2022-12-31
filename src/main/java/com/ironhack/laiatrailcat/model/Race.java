package com.ironhack.laiatrailcat.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int distance;
    private int slope;
    private String location;
    private LocalDate date; //"yyyy-MM-dd"
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant lastUpdatedAt;

    public Race(String name, int distance, int slope, String location, LocalDate date) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.slope = slope;
        this.location = location;
        this.date = date;
    }

    public Race(){};
}
