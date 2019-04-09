package Lesson5;

public class TestAnimal {
    public static void main(String[] args) {
        Cat[] arrayOfAnimals = new Cat[3];

        arrayOfAnimals[0] = new Cat("Барсик", 350, 3, 3,10);
        arrayOfAnimals[1] = new Cat("Трезор", 350, 0, 3,10);
        arrayOfAnimals[2] = new Cat("Васька", 350, 1, 3,2);

        Bowl bowl = new Bowl(20, 20);

        for (Cat animals: arrayOfAnimals) {

            if (bowl.getFood() == 0) {
                bowl.fullFood();
            }
                animals.eat(bowl);
            System.out.println(animals.fullness);
        }

    }
}
