package Lesson4.Part2;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 200, 0,  2.0);
        cat.info();
        cat.jump(1.5);
        cat.jump(2.1);
        cat.swim(1);
        cat.run(300);
        cat.run(199);

        Dog dog = new Dog("Sharik", 500, 10, 0.5);
        dog.info();
        dog.jump(0.5);
        dog.jump(0.6);
        dog.swim(10);
        dog.run(600);
        dog.run(350);

    }
}
