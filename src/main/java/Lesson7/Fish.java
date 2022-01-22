package Lesson7;

public class Fish extends Animal {

    public Fish(String name, int swim) {
        this.name = name;
        this.swim = swim;
    }

    public void run(int arg) {
        System.out.println(name + " не умеет бегать.");
    }
}
