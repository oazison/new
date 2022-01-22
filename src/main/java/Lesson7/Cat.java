package Lesson7;

public class Cat extends Animal {

    public Cat(String name, int run) {
        this.name = name;
        this.run = run;
    }

    public void swim(int arg) {
        System.out.println(name + " не умеет плавать.");
    }
}
