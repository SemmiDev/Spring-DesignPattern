package com.sammidev.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeConfig {

    @Bean
    @Scope("prototype")
    public Student MIPAStudent() {
        return Student.builder()
                .nisn("12345")
                .type(StudentType.MIPA)
                .build();
    }
}
