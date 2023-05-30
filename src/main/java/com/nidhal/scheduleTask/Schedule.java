package com.nidhal.scheduleTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 * 1-10 1 *")
    public void scheduleTask(){
        System.out.println("Hello World :)");
    }
}
