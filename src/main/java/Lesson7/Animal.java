package Lesson7;

public abstract class Animal {
    static  String name;
    private static final int MAX_RUN = 0;
    private static final int MAX_SWIM =0;

    public static void run(int arg) {
        if (arg <= MAX_RUN) {
            System.out.println(name + " пробежал " + arg + " метров");
        } else {
            System.out.println(name + " больше " + MAX_RUN + " метров пробежать не может.");
        }
    }

    public static void swim(int arg) {
        if (arg <= MAX_SWIM) {
            System.out.println(name + " пробежал " + arg + " м.");
        } else {
            System.out.println(name + " больше " + MAX_SWIM + " метров проплыть не может.");
        }
    }

    public String getName() {
        return name;
    }
}
