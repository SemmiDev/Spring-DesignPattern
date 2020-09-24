package com.sammidev.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentServiceImpl implements StudentService {
    @Override
    public void save(String nisn, String name) {
        log.info("SAVE NEW STUDENT WITH NISN: {} NAME: {}", nisn, name);
    }
}
