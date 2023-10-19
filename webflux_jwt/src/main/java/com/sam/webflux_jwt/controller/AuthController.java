package com.sam.webflux_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AuthController {

    //We are going to be able to enter this endpoint only if we have been authenticated
    @GetMapping("/auth")
    public Mono<String> auth(){
        return Mono.just("welcome to the party");
    }

}
