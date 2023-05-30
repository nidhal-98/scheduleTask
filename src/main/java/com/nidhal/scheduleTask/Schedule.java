package com.nidhal.scheduleTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 15 8 * * 0-4")
    public void scheduleTask(){
        System.out.println("Hello World :)");
    }
}
