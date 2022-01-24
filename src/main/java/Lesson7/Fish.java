package Lesson7;

public class Fish extends Animal {

    private static final int MAX_SWIM=1200;

    public Fish(String name) {
        this.name = name;
    }

    public static void run(int arg) {
        System.out.println(name + " не умеет бегать.");
    }
}
