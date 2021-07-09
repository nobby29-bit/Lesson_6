package ru.geekbrains;

public class Dog extends Animals{

    public Dog (String name){
        super(name,"Dog");
    }

    @Override
    public void run(int distance){
        if (distance<500) {
            System.out.printf("%s пробежал: %d м\n", this.name, distance);
        }else {
            System.out.printf("%s не может пробежать: %d м, он устал\n", this.name, distance);
        }
    }
    @Override
    public void swim(int distance){
        if (distance<10) {
            System.out.printf("%s проплыл: %d м\n", this.name, distance);
        }else {
            System.out.printf("%s не может проплыть: %d м, он устал\n", this.name, distance);
        }
    }
}
