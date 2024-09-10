package com.example.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Table(name = "greetings")
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "greeting_text", nullable = false)
    private String greetingText;

    @Column(name = "from_person", nullable = false, length = 100)
    private String fromPerson;

    @Column(name = "to_person", nullable = false, length = 100)
    private String toPerson;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    // Constructors
    public Greeting() {
        this.timestamp = LocalDateTime.now(); // Set default timestamp
    }

    public Greeting(String greetingText, String fromPerson, String toPerson, Integer rating) {
        this.greetingText = greetingText;
        this.fromPerson = fromPerson;
        this.toPerson = toPerson;
        this.timestamp = LocalDateTime.now(); // Set default timestamp
        this.rating = rating;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGreetingText() {
        return greetingText;
    }

    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;
    }

    public String getFromPerson() {
        return fromPerson;
    }

    public void setFromPerson(String fromPerson) {
        this.fromPerson = fromPerson;
    }

    public String getToPerson() {
        return toPerson;
    }

    public void setToPerson(String toPerson) {
        this.toPerson = toPerson;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
