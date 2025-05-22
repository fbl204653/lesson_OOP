package org.example;

public class Shark extends Fish{
    public Shark(){};
    @Override
    public void breath(){
        System.out.println("Shark Breath");
    }
    @Override
    public void swim(){
        System.out.println("Shark Swim");
    }
    public void hunt(){
        System.out.println("Shark Hunt");
    }
}
