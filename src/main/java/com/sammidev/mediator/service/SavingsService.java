package com.sammidev.mediator.service;
import com.sammidev.mediator.entity.Savings;
import com.sammidev.mediator.entity.Student;
import com.sammidev.mediator.event.SavingsEvent;
import com.sammidev.mediator.event.StudentEvent;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class SavingsService implements ApplicationListener<StudentEvent>, ApplicationEventPublisherAware {
    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void onApplicationEvent(StudentEvent event) {
        log.info("Receive new student {}", event.getStudent());

        Savings savings = Savings.builder()
                .id(event.getStudent().getId())
                .balance(new BigDecimal("100000"))
                .build();

        applicationEventPublisher.publishEvent(new SavingsEvent(savings));
    }
}