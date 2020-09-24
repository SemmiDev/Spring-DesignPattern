package com.sammidev.observer;


import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class FushionEvent extends ApplicationEvent {

    @Getter
    Fushion fushion;

    public FushionEvent(Fushion fushion) {
        super(fushion);
        this.fushion = fushion;
    }
}

