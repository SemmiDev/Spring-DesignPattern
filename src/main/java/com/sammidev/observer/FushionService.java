package com.sammidev.observer;

import lombok.Setter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class FushionService implements ApplicationEventPublisherAware {

    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    public Fushion save(String nisn, String nip, String nameStudent, String nameEmployee) {
        Student student   = Student.builder().nisn(nisn).name(nameStudent).build();
        Employee employee = Employee.builder().nip(nip).name(nameEmployee).build();
        Fushion fushion = Fushion.builder().student(student).employee(employee).build();

        applicationEventPublisher.publishEvent(new FushionEvent(fushion));
        return Fushion.builder().build();
    }
}