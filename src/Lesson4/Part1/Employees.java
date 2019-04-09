package Lesson4.Part1;

//1. Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;
//2. Конструктор класса должен заполнять эти поля при создании объекта;
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

public class Employees {
    private String fIO;
    private int age;
    private String email;
    private String tel;
    private String coin;

    public int getAge() {

        return age;
    }


    public Employees(String fIO, String email, String tel, String coin, int age) {
        this.fIO = fIO;
        this.email = email;
        this.age = age;
        this.tel = tel;
        this.coin = coin;
    }

    public void printInfo(){
        System.out.println("fIO "+ fIO + " email " + email + " Tel: " + tel + " Coin: " + coin + " age " + age);
    }
}