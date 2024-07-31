package com.spring;

public class TrackCoach implements Coach{

    FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String workingHours() {
        return "Run for 30min in the track";
    }

    @Override
    public void displayFortune() {
        System.out.println(fortuneService.getFortune());
    }

    public void startUpStuff(){
        System.out.println("I am inside the start up class");
    }

    public void destroyStuff(){
        System.out.println("I am inside destroy method");
    }
}
