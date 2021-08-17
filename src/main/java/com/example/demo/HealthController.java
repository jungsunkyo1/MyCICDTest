package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator/health")
public class HealthController {
    
    @GetMapping
    public String healthy(){
        return "healthy";
    }
}
