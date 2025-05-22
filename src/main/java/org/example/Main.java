package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
    Animal animal = new Animal();
    Bird bird = new Bird();
    Fish fish = new Fish();
    Shark shark = new Shark();
    animal.breath();
    bird.breath();
    bird.fly();
    fish.breath();
    fish.swim();
    shark.breath();
    shark.swim();
    shark.hunt();

//    Animal newBird = new Bird();
//    newBird.fly();
    }
}