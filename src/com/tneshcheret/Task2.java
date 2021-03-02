package com.tneshcheret;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Задание 2) Попросить пользователя ввести строку и имя файла. Записать строку в файл.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя файла:");
        String nameFile = scanner.nextLine();
        System.out.println("Введите строку для записи в файл:");
        String lineToWrite = scanner.nextLine();

        writeToFile(nameFile, lineToWrite);
    }

    private static void writeToFile(String nameFile, String lineToWrite) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile))) {
            writer.write(lineToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
