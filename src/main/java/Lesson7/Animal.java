package Lesson7;

public abstract class Animal {
    String name;
    int run;
    int swim;

    public void run(int arg) {
        if (arg <= run) {
            System.out.println(name + " пробежал " + arg + " метров");
        } else {
            System.out.println(name + " больше " + run + " метров пробежать не может.");
        }
    }

    public void swim(int arg) {
        if (arg <= swim) {
            System.out.println(name + " пробежал " + arg + " м.");
        } else {
            System.out.println(name + " больше " + swim + " метров проплыть не может.");
        }
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }
}
