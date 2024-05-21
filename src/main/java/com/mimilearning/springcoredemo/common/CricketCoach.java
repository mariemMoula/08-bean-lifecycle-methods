package com.mimilearning.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component //marks the class a spring bean
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    // define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In my PostConstruct : "+getClass().getSimpleName());
    }
    // define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In my PreDestroy : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Exercise from CricketCoach";
    }
}
