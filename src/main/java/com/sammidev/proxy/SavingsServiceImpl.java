package com.sammidev.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Service
@Validated
public class SavingsServiceImpl implements SavingsService {

    @Override
    public void save(@NotBlank String nisn, @NotBlank String name) {
        // do something
    }
}
