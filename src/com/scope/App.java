package com.scope;

public class App {
    private String name;

    public App(){
        System.out.println("No - Arg Constructor is called");
    }

    public App(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor has been called with name " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter Method got called with name " + this.name);
    }
}
