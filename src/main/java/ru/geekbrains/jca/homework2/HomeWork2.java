package ru.geekbrains.jca.homework2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
//         task1();
//         task2();
//         task3();
        
    // Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(Arrays.toString(arr));
        }

    // Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void task2() {
        int[] arr = new int[8];
        for (int i = 0; i <= 8; i++) {
            arr[0] = 0;
            arr[1] = 3;
            arr[2] = 6;
            arr[3] = 9;
            arr[4] = 12;
            arr[5] = 15;
            arr[6] = 18;
            arr[7] = 21;
        }
        System.out.println(Arrays.toString(arr));
        }


    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= arr.length; i++) {
            arr [i] = i;
            if (arr [i] < 6){
                arr [i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
