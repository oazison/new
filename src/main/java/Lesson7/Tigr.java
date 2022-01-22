package Lesson7;

public class Tigr extends Animal {

    public Tigr(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void swim(int arg) {
        if (arg <= swim) {
            System.out.println(name + " не любит плавать, поэтому проплыл " + arg / 2 + " метров.");
        } else {
            System.out.println(name + " больше " + swim + " метров проплыть не может.");
        }
    }
}
