/**
 * Задача - создать программу, которая:
 * 1.) считывает числа, введенные пользователем
 * 2.) при введении "Enter" суммирует введенные числа и выдает результат
 * 3.) при введении другого значения выдает предупреждение
 * Особое условие - не использовать Integer.parseInt и boolean, т.к. решение есть в интернете
 *                  использовать hasNext, т.к. такого решения не нашла
 *                  использовать только while, в рамках обучения
 */
package com.company;

import java.util.Scanner; // распаковываем сканнер и паттерны, чтобы сработали строки 19 и 24
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter numbers:"); //выводим запрос на ввод для пользователя
        Scanner console = new Scanner(System.in); // считываем информацию, введенную пользователем
        int sum = 0; //вводим переменную, чтобы в дальнейшем посчитать сумму чисел, пока она равна 0
        while (console.hasNextInt()){ // включаем цикл - пока пользователь вводит числа..
            int num = console.nextInt(); // .. считываем их и..
            sum += num; // ..суммируем между собой
            if (console.hasNext("Enter")) // если пользователь ввел не числовое значение, проверям
                System.out.println(sum); // если "Enter" выдаем сумму чисел
            else if (console.hasNextInt()){} // если не "Enter", то проверяем, чтобы это было не число "пустым" if
            else // в противном случае. после 2х первых чисел выдает предупреждение
                System.out.println("Could not be find. Please enter \"Enter\" or some number"); // если не число, то выдаем предупреждение пользователю
        }
    }
}
/*
Основной "косяк" состоит в том, что, при введении не числового значение сразу,
не выдает никакого результата вообще, но такова работа цикла while
 */
