package com.kkalletla.springJavaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        /*Read Spring Config File*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JavaAnnotations-applicationContext.xml");

        /*Retrieve the bean from Container*/
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        /*Call a method on the bean*/
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        /*Close the connection*/
        context.close();
    }
}
