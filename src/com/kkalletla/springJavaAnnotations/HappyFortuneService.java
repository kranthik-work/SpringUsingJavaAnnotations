package com.kkalletla.springJavaAnnotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService{

    private String[] fortunes = {"Today is your lucky Day",
                                 "Hope for a better Tomorrow",
                                 "Better luck next time"};
    @Override
    public String getFortune() {

        Random random = new Random();
        return "Happy Fortune Service: "+fortunes[random.nextInt(3)];
    }
}
