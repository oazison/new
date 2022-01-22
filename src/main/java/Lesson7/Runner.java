package Lesson7;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("Борис", 10);
        Dog dog = new Dog("Шарик", 500, 50);
        Tigr tigr = new Tigr("Шерхан", 700, 150);
        Fish fish = new Fish("Дори", 1000);

        fish.run(20);
        dog.run(600);
        tigr.swim(150);

    }
}
