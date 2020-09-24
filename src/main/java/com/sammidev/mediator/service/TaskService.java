package com.sammidev.mediator.service;

import com.sammidev.mediator.entity.Savings;
import com.sammidev.mediator.entity.Student;
import com.sammidev.mediator.entity.Task;
import com.sammidev.mediator.event.SavingsEvent;
import com.sammidev.mediator.event.StudentEvent;
import com.sammidev.mediator.event.TaskEvent;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Slf4j
@Component
public class TaskService implements ApplicationListener<StudentEvent>, ApplicationEventPublisherAware {
    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void onApplicationEvent(StudentEvent event) {
        Task task = Task.builder()
                .id(event.getStudent().getId())
                .nameTask("Memasak Air")
                .limit(LocalDateTime.now().plusDays(2))
                .build();
        applicationEventPublisher.publishEvent(new TaskEvent(task));
    }
}

