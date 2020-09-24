package com.sammidev.mediator.service;

import com.sammidev.mediator.event.TaskEvent;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentServiceTask implements ApplicationListener<TaskEvent>, ApplicationEventPublisherAware {

    @Setter
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void onApplicationEvent(TaskEvent taskEvent) {
        log.info("ID TASK {}, NAME TASK {}, LIMIT TASK {}",
                taskEvent.getTask().getId(),
                taskEvent.getTask().getNameTask(),
                taskEvent.getTask().getLimit());
    }
}
