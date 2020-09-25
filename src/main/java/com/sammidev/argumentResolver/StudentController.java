package com.sammidev.argumentResolver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/api/student/{id}")
    public Student get(@PathVariable("id") String id, MandatoryParameter mandatoryParameter) {
        // logic
        return null;
    }
}
