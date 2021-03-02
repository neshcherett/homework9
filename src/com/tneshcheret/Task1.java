package com.tneshcheret;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
	/* Задание 1) Заполнить массив случайными числами. Подсчитать:
      - количество элементов которые больше своего соседа слева
      - количество четных элементов
      - количество элементов которые меньше среднего арифметического
    */
        int[] arr = createRandomArray(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество элементов которые больше своего соседа слева " + getQuantityElementsGreaterLeftNeighbor(arr));
        System.out.println("Количество четных элементов " + getQuantityEvenElements(arr));
        System.out.println("Среднее арифметическое " + getAverage(arr));
        System.out.println("Количество элементов которые меньше среднего арифметического " + getQuantityElementsLessAverage(arr));
    }

    private static int getQuantityElementsLessAverage(int[] arr) {
        double average = getAverage(arr);
        int counterElementsLessAverage = 0;
        for (int j : arr) {
            if (j < average) {
                counterElementsLessAverage++;
            }
        }
        return counterElementsLessAverage;
    }

    private static double getAverage(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum / arr.length;
    }

    private static int getQuantityEvenElements(int[] arr) {
        int counterEvenElements = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                counterEvenElements++;
            }
        }
        return counterEvenElements;
    }

    private static int getQuantityElementsGreaterLeftNeighbor(int[] arr) {
        int counterElementsGreaterLeftNeighbor = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                counterElementsGreaterLeftNeighbor++;
            }
        }
        return counterElementsGreaterLeftNeighbor;
    }

    private static int[] createRandomArray(int lengthArray) {
        int[] arr = new int[lengthArray];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
