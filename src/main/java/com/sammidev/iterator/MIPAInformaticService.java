package com.sammidev.iterator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MIPAInformaticService implements MIPAService{

    @Override
    public boolean isSupport(TypeOfDepartment type) {
        return TypeOfDepartment.INFORMATICS.equals(type);
    }

    @Override
    public void apply(MIPA mipa) {
        log.info("APPLY INFORMATIC");
    }
}