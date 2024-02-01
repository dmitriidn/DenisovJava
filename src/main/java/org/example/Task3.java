package org.example;

public class Task3 {
    public static void main(String[] args) {

        // Заданный массив целых чисел
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Цикл для поиска четных чисел
        System.out.println("Чётные числа из массива:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);
        }
    }
}

    //    Task №3
   //     Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
   //     Необходимо написать программу, которая выведет в консоль все четные числа.