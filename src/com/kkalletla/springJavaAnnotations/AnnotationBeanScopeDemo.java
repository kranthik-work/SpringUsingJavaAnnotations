package com.kkalletla.springJavaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

    private static final String className = "AnnotationBeanScopeDemo: ";
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");

        Coach firstCoach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("tennisCoach", Coach.class);
        boolean isSame = (firstCoach == secondCoach);

        System.out.println(className + "Both objects are same: "+isSame);
        System.out.println(className+ firstCoach);
        System.out.println(className+secondCoach);
        context.close();
    }
}
