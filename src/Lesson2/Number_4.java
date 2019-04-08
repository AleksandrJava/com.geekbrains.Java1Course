package Lesson2;

//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

public class Number_4 {
    public static void main(String args[]){
        int[][]arr = new int[6][6];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j || i == arr.length-j-1){
                    arr[i][j] = 1;
                }
            }

        }

        printArr(arr);
    }


    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
