package Lesson7;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("Борис");
        Dog dog = new Dog("Шарик");
        Tigr tigr = new Tigr("Шерхан");
        Fish fish = new Fish("Дори");

        fish.run(20);
        dog.run(600);
        tigr.swim(150);

    }
}
