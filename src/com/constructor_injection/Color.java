package com.constructor_injection;

public class Color {

    private String color;
    private String intensity;

    public Color(String color, String intensity) {
        this.color = color;
        this.intensity = intensity;
    }

    public void displayColor(){

        System.out.println("Color is " + color);
        System.out.println("Intensity is " + intensity);
    }
}
