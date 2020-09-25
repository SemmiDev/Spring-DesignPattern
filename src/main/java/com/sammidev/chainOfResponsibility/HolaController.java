package com.sammidev.chainOfResponsibility;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping
    public String hello() {
        return "Hollaaa Sam";
    }
}
