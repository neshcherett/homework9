package com.tneshcheret;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Задание 3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве
        int[] array = createRandomArray(10);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска:");
        int searchNumber = scanner.nextInt();

        System.out.println(checkAvailabilityNumber(searchNumber, array));
    }

    private static boolean checkAvailabilityNumber(int searchNumber, int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (searchNumber == array[middleIndex]) {
                return true;
            } else {
                if (searchNumber < array[middleIndex]) {
                    lastIndex = middleIndex - 1;
                } else {
                    if (searchNumber > array[middleIndex]) {
                        firstIndex = middleIndex + 1;
                    }
                }
            }
        }
        return false;
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
