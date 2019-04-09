package Lesson5;

public class Cat extends Animal {
    int appetite;
    boolean fullness = false;

    public Cat(String name, int run, int swim, double jump, int appetite) {
        super("Кот " + name);
        this.run = run;
        this.swim = swim;
        this.jump = jump;
        this.appetite = appetite;
    }


    public void swim(int distance) {
        System.out.println("Кот " + this.name + " не умеет плавать!");
    }

    public boolean run(int dist) {
        if (dist <= this.run){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }


    }

    public boolean jump(double height) {
        if (height <= this.jump) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }


    public void eat(Bowl bowl) {
        if (appetite > 0 && bowl.food >= appetite) {
            this.fullness = true;
            bowl.food = bowl.food - appetite;
            System.out.println(this.name + " съел " + appetite + " кусков");
        } else {
            System.out.println(this.name + " Не хватило!");

        }
    }

}
