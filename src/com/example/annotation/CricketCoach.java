package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class CricketCoach implements Coach{

    @Autowired
    @Qualifier("locationServiceIdTwo")
    private LocationService locationService;

    private String gameName;

    @Value("Red")
    private String jerseyColor;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getJerseyColor() {
        return jerseyColor;
    }

    public void setJerseyColor(String jerseyColor) {
        this.jerseyColor = jerseyColor;
    }

    @Override
    public String practice() {
        return "Run 5 Km from Cricket Coach";
    }

    @Override
    public void displayType() {
        System.out.println("This is cricket coach");
        System.out.println("Your jersey color is " + getJerseyColor());
        System.out.println("Your game name is " + getGameName());
        System.out.println("Location is " + locationService.getLocation());
    }
}
