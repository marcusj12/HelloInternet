package com.careerdevs.helloInternet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
public class NasaController {

    @GetMapping("/apod")
    public Object apodHandler (RestTemplate restTemplate) {
        return restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY", Object.class);
    }


}
