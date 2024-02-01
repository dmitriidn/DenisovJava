package org.example;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение математических операций
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;

        // Проверка деления на ноль
        if (b != 0) {
            int division = a / b;
            System.out.println("Результаты математических операций");
            System.out.println("Сложение: " + sum);
            System.out.println("Вычитание: " + difference);
            System.out.println("Умножение: " + multiplication);
            System.out.println("Деление: " + division);
        } else {
            System.out.println("Результаты математических операций");
            System.out.println("Сложение: " + sum);
            System.out.println("Вычитание: " + difference);
            System.out.println("Умножение: " + multiplication);
            System.out.println("Деление: Ошибка! На ноль делить нельзя!");
        }

        scanner.close();
    }
    }

//         Task №1
//         Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//        - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
//        "a > b", "a < b" или "a = b";
//        - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
