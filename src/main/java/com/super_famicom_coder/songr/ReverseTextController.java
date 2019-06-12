package com.super_famicom_coder.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseTextController {

    @GetMapping("/reverse")
    public String getReverse() {
        return "Welcome to the reverse page!";
    }
}
