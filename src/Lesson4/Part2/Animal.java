package Lesson4.Part2;

//Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//В качестве параметра каждому методу передается величина,
//означающая или длину препятствия (для бега и плавания), или высоту (для прыжков);


public abstract class Animal {

    protected String name;
    protected int run;
    protected double jump;
    protected int swim;


    public Animal() {
    }


    public void info() {
        System.out.println("Name: " + this.name + " /RunLimit: " + this.run + " meters/" + " /swim:" + this.swim + " /Jump: " + this.jump + " meters/");

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

    public boolean swim(int dist){
            if (dist <= this.swim) {
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        }
}

