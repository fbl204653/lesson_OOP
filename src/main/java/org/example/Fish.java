package org.example;

public class Fish extends Animal{
    public Fish(){};
    @Override
    public void breath(){
        System.out.println("Fish Breath");
    }
    public void swim(){
        System.out.println("Fish Swim");
    }
}
