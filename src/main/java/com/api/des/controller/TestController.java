package com.api.des.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "test";
    }


    @GetMapping("/favicon.ico")
    public void favicon() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
