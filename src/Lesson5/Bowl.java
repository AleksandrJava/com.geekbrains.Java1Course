package Lesson5;

//Кот должен есть из миски.
//Создайте такую сущность, которая будет обладать объёмом и едой в ней,
//а также методами наполнения и получения информации о количестве еды;

public class Bowl {
    int size;
    int food;

        public Bowl(int size, int food) {
            this.size = size;
            this.food = food;
        }
        public int getFood () {
            System.out.println(food);
            return food;
        }

        public int fullFood () {
            System.out.println("Еда в тарелке закончилась. Наполняем заново");
            food = size;
            return food;
        }


}
