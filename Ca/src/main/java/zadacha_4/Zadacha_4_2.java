package zadacha_4;

import java.util.Arrays;

public class Zadacha_4_2 {
    public static void main(String[] args) {

        int[] arr;
        int minArr = 0;
        int maxArr = 0;
        int nearest;
        int indexA = 0;
        int indexB = 0;
        //готовая часть
        arr = new int[20]; // задаем размерность
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 21) - 10);
            System.out.println(arr[i]);
        } //массив создан


        for (int i = 0; i < arr.length; i++) {      //определяем максимальное значение символов
            if (maxArr < arr[i]) {
                maxArr = arr[i];
            }
        }
        System.out.println("максимальное значение равно " + maxArr);

        for (int i = 0; i < arr.length; i++) {      //определяем минимальное значение символов
            if (minArr > arr[i]) {
                minArr = arr[i];
                indexA = i;
            }
        }
        System.out.println("минимальное зачение равно = " + minArr);

        nearest = maxArr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (nearest >= arr[i]) {
                    nearest = arr[i];
                    indexB = i;
                }
            }
        }

        System.out.println("минимальный положительный элемент массива " + nearest);
        System.out.println("номер максимального отрицательного элемента в массиве " + indexA);
        System.out.println("номер минимального положительного элемента в массиве  " + indexB);

        int[] temp = arr;
        arr[indexA] = nearest;
        arr[indexB] = minArr;

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        } //массив создан места поменяны
    }
}
