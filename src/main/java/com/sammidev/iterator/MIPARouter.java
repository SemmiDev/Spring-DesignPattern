package com.sammidev.iterator;

import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MIPARouter implements ApplicationContextAware {

    @Setter
    private ApplicationContext applicationContext;

    public void apply(MIPA mipa) {
        applicationContext.getBeansOfType(MIPAService.class).values()
                .stream()
                .filter(service -> service.isSupport(mipa.getDepartment()))
                .findFirst()
                .ifPresent(service -> service.apply(mipa));
    }
}