package ru.geekbrains;

import java.util.Random;

public class HomeWork {
    public static Random rand = new Random();

    public static void main(String[] args){

        Animals[] animal = {
                new Cat("Dimok"),
                new Dog ("Dryzhok"),
                new Cat("Myrka"),
                new Dog ("Polkan"),
                new Cat("Barsik"),
                new Dog ("Rex"),
        };

        for (int i=0; i < animal.length;i++) {
            int distanceRun = rand.nextInt(550);
            int distanceSwim = rand.nextInt(18);
            animal[i].run(distanceRun);
            if (animal[i] instanceof Dog){
            animal[i].swim(distanceSwim);}
        }
    }
}
