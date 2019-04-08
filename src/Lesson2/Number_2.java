package Lesson2;

//Задать пустой целочисленный массив размером 8.
//С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

public class Number_2 {
    public static void main(String args[]){
        int[]arr = new int[8];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = count;
            count = count + 3;
        }

        printArr(arr);
    }


    public static void printArr(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
