package com.sammidev.mediator.event;

import com.sammidev.mediator.entity.Task;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

public class TaskEvent extends ApplicationEvent{

    @Getter
    Task task;

    public TaskEvent(Task task) {
        super(task);
        this.task = task;
    }
}
