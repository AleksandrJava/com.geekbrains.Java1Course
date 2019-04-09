package Lesson4.Part1;

//Создать массив из 5 сотрудников;
//С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class MainEmploye {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Иванов","ivanov@mail.ru","+79518846321", "25600", 18);
        employees[1] = new Employees("Петров","petrov@mail.ru","+76045521323", "38000", 39);
        employees[2] = new Employees("Смирнов","smirnov@mail.ru","+79375586012", "59000", 44);
        employees[3] = new Employees("Ганин","ganin@mail.ru","+79044449944", "150000", 46);
        employees[4] = new Employees("Зенин","zenin@mail.ru","+79348815698", "24000", 65);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}
