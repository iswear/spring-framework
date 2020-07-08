package com.hujb.spring.study;

import com.hujb.spring.study.beans.User;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.hujb.spring.study")
public class StudyApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudyApplication.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
