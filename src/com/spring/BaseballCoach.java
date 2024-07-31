package com.spring;

public class BaseballCoach implements Coach {

    FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String workingHours() {
        return "Run 15kms";
    }

    public void displayFortune(){
        System.out.println(fortuneService.getFortune());
    }
}
