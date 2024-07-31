package com.autowire;

public class Table{

    private Texture texture;

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void function(){
        texture.sayClass();
    }
}
