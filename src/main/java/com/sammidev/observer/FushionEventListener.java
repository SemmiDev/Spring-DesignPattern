package com.sammidev.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FushionEventListener implements ApplicationListener<FushionEvent> {

    @Override
    public void onApplicationEvent(FushionEvent fushionEvent) {
        log.info("RECEIVE {}", fushionEvent.getFushion().getEmployee());
        log.info("RECEIVE {}", fushionEvent.getFushion().getStudent());
    }
}
