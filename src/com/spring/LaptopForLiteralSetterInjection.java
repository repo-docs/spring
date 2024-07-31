package com.spring;

public class LaptopForLiteralSetterInjection {

    private String brand;
    private String os;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void displaySpecs(){
        System.out.println("The brand is "+ brand);
        System.out.println("The operating system is " + os);
    }
}
