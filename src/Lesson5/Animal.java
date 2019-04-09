package Lesson5;

public class Animal {
    protected String name;
    protected int run;
    protected double jump;
    protected int swim;


    public Animal() {
        this.name = "Безымянный";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Name: " + this.name + " /RunLimit: " + this.run + " meters/" + " /swim:" + this.swim + " /Jump: " + this.jump + " meters/");

    }

}
