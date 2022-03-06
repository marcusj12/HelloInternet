package com.careerdevs.helloInternet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootControllers {

    @GetMapping("/")
    private String routeRoute () {
        return "You requested the root route";
    }
}
