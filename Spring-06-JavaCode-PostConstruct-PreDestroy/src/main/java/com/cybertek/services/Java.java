package com.cybertek.services;

import com.cybertek.interfaces.Course;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours: 30");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }
}
