package com.sammidev.mediator.service;

import com.sammidev.mediator.entity.Student;
import com.sammidev.mediator.event.SavingsEvent;
import com.sammidev.mediator.event.StudentEvent;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentService implements ApplicationListener<SavingsEvent>, ApplicationEventPublisherAware{

    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    public Student save(String id,String name,String email) {
        Student student = Student.builder()
                .id(id).name(name).email(email)
                .build();
        applicationEventPublisher.publishEvent(new StudentEvent(student));
        return student;
    }

    @Override
    public void onApplicationEvent(SavingsEvent savingsEvent) {
        log.info("ADD MONEY FOR STUDENT {} WITH TOTAL {}",
                savingsEvent.getSavings().getId(),
                savingsEvent.getSavings().getBalance());
    }
}
