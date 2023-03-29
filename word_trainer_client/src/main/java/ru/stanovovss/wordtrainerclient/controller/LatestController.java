package ru.stanovovss.wordtrainerclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LatestController {
    @GetMapping("/latest")
    public String getLatest() {
        return "Hello World!";
    }
}
