package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод двух строк
            System.out.print("Введите первую строку (a): ");
            String a = scanner.nextLine();

            System.out.print("Введите вторую строку (b): ");
            String b = scanner.nextLine();

            // Сравнение строк и вывод результата
            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }

            scanner.close();
        }
    }


    //  Task №2
   //   Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
   //   В результате сравнения в консоль должно быть выведено одно из сообщений:
   //  "Строки неидентичны" или "Строки идентичны"