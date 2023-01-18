package com.cybertek.services;

import com.cybertek.interfaces.Course;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours: 20");
    }
}
