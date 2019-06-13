package com.super_famicom_coder.songr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapitalizeController {

    @GetMapping("/capitalize")
    public String getCapitalize() {
        return "Welcome to the Capitalize page!";
    }

    @GetMapping("/capitalize/{text}")
    public String getCapitalizeText(@PathVariable String text) {
        return text.toUpperCase();
    }
}
