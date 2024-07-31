package com.spring;

public class CricketCoach implements Coach{

    FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String workingHours() {
        return "Run 10km each day";
    }

    @Override
    public void displayFortune() {
        System.out.println(fortuneService.getFortune());
    }
}
