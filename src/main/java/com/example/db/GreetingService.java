package com.example.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Create or Update a Greeting
    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    // Get a Greeting by ID
    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    // Get all Greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // Delete a Greeting by ID
    public void deleteGreeting(Long id) {
        greetingRepository.deleteById(id);
    }
}
