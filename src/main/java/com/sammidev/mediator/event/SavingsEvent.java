package com.sammidev.mediator.event;

import com.sammidev.mediator.entity.Savings;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class SavingsEvent extends ApplicationEvent {

    @Getter
    private Savings savings;

    public SavingsEvent(Savings savings) {
        super(savings);
        this.savings = savings;
    }
}