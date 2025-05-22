package org.example;

public class Bird extends Animal{
    public Bird(){};
    @Override
    public void breath(){
        System.out.println("Bird Breath");
    }
    public void fly(){
        System.out.println("Bird Fly");
    }
}
