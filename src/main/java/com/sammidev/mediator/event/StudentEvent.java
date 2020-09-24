package com.sammidev.mediator.event;

import com.sammidev.mediator.entity.Student;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class StudentEvent extends ApplicationEvent {

    @Getter
    private Student student;

    public StudentEvent(Student student) {
        super(student);
        this.student = student;
    }
}
