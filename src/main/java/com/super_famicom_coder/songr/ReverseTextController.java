package com.super_famicom_coder.songr;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReverseTextController {

    @GetMapping("/reverse")
    @ResponseBody
    public String getReverseSentence(@RequestParam String sentence) {
        String[] words = sentence.split(" ");
        String reversedString = "";

        for (int i = words.length - 1; i >= 0; i-- ) {
            reversedString = reversedString + words[i] + " ";
        }

        return reversedString;
    }
}
