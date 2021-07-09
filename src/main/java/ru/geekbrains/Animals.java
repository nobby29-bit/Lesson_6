package ru.geekbrains;

public class Animals {
    protected String name;
    protected String type;

    public Animals(String name, String type){
        this.name = name;
        this.type = type;
    }

   public void run(int distance){
       System.out.printf("%s пробежал: %d\n м",this.name, distance);
   }

   public void swim(int distance){
       System.out.printf("%s проплыл: %d\n м",this.name, distance);
   }
}
