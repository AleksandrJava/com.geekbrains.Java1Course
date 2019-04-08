package Lesson2;

//Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

public class Number_5 {
    public static void main(String args[]){
        int[]arr = {6,64,8,18,16,25,30,2};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
    }

}
