package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringbootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(Spring07SpringbootDemoApplication.class, args);

        Course course = container.getBean("java",Course.class);

        System.out.println(course.getTeachingHours());

    }

}
