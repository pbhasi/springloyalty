package com.example.db;

//import java.util.concurrent.atomic.AtomicLong;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    private GreetingService greetingService;
	//private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();

     @GetMapping("/greetings")
    public String getAllGreetings() {
        System.out.println(greetingService);
        return "Hello World";
    }
	

}