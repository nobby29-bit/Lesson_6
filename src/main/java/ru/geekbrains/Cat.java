package ru.geekbrains;

public class Cat extends Animals{

    public Cat (String name){
        super(name,"Cat");
    }

    @Override
    public void run(int distance){
        if (distance<200) {
            System.out.printf("%s пробежал: %d м\n", this.name, distance);
        }else {
            System.out.printf("%s не может пробежать: %d м, он устал\n", this.name, distance);
        }
    }
    @Override
    public void swim(int distance){
        System.out.printf("%s не умеет плавать Коты боятся воды\n",this.name);
    }
}
