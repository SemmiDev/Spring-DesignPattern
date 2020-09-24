package com.sammidev.proxy;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

public interface SavingsService {

    @Validated
    void save(@NotBlank String nisn, @NotBlank String name);
}
