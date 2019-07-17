package com.kkalletla.springJavaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

    private final String className = "TennisCoach: ";
    //@Autowired
    FortuneService services;

    /*public TennisCoach() {
        System.out.println(className+"Inside Default Constructor");
    }

    @Autowired
    public TennisCoach(FortuneService services) {
        System.out.println(className+"Inside Parameterize Constructor");
        this.services = services;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand Volley";
    }

    @Override
    public String getDailyFortune() {
        return services.getFortune();
    }

    /*@Autowired
    public void setServices(FortuneService services) {
        System.out.println(className+"Inside setServices method");
        this.services = services;
    }*/

    @Autowired
    @Qualifier("happyFortuneService")
    public void setServicesParameter(FortuneService services){
        System.out.println(className+"Inside setServicesParameter method");
        this.services=services;
    }
}
