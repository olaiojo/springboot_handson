package com.example.feature.level1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Level1Application /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(Level1Application.class, args);
    }
//
//    private final RestTemplate restTemplate;
//
//    public Level1Application(RestTemplateBuilder restTemplateBuilder){
//        this.restTemplate = restTemplateBuilder.build();
//    }
//
//    @Override
//    public void run(String... args){
//        Quote response = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        System.out.println(response.toString());
//    }
}
