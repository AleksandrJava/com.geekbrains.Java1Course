package Lesson2;

//Написать метод, в который передается не пустой одномерный целочисленный массив,
//метод должен вернуть true, если в массиве есть место,
//в котором сумма левой и правой части массива равны.
//Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
//         checkBalance ([2, 1, 1, 2, 1]) → false,
//         checkBalance ([10, || 10]) → true,
//        граница показана символами ||, эти символы в массив не входят;

import java.util.Scanner;

public class Number_6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean a;
        int count1 = 0;
        int count2 = 0;
        System.out.println("Введите длину массива");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        if(arr.length % 2 == 1){
            for (int i = 0; i < arr.length/2 +1; i++) {
                count1 = count1 + arr[i];}
            for (int i = arr.length / 2 + 1; i < arr.length; i++) {
                count2 = count2 + arr[i];
            }
        } else {
            for (int i = 0; i < arr.length/2; i++) {
                count1 = count1 + arr[i];}
            for (int i = arr.length/2 ; i < arr.length; i++) {
                count2 = count2 + arr[i];
            }
        }
        if(count1 == count2) {
            a = true;
        } else {
            a = false;
        }
        System.out.println(a);
    }
}
