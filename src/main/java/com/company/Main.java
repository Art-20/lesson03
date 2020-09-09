package com.company;

import com.company.util.Checker;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Что будем делать?");
        System.out.println("Для включения калькулятора введите 1");
        System.out.println("Для для проверки числа четное/нечетное введите 2");
        System.out.println("Для игры введите 3");

        Scanner sc4 = new Scanner(System.in);
        int variant = sc4.nextInt();


        //Калькулятор
        if (variant == 1) {

            Calculator calc = new Calculator();

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число a: ");
            int a = sc.nextInt();

            System.out.println("Введите второе число b: ");
            int b = sc.nextInt();

            int val1 = calc.add(a, b);
            int val2 = calc.minus(a, b);
            long val3 = calc.multiply(a, b);
            double val4 = calc.division(a, b);


            System.out.println("Введите действие: Сложение - 1, Вычитание - 2, Умножение - 3, Деление - 4 ");
            Scanner sc1 = new Scanner(System.in);
            int act = sc.nextInt();

            if (act == 1) {
                System.out.println("Сумма a+b= " + val1);
            }
            if (act == 2) {
                System.out.println("Разность a-b=   " + val2);
            }
            if (act == 3) {
                System.out.println("Произведение a*b=   " + val3);
            }
            if (act == 4 && b != 0) {
                System.out.println("Частное a/b= " + val4);
            }
            if (act == 4 && b == 0) {
                System.out.println("На ноль делить нельзя!!!");
            }
        }

        // Сhecker
        if (variant == 2) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите число для проверки : ");
            int number = sc2.nextInt();
            Checker checker = new Checker();
            checker.isEven(number);
            checker.isOdd(number);

            if (checker.isEven(number) == true) {
                System.out.println("число " + number + " четное");
            } else {
                System.out.println("число " + number + " нечетное");
            }
        }


            // Game
            if (variant == 3) {
              //  System.out.println("Игра в разработке ");
                Game game = new Game();
                game.game();

            }
            if (variant != 1 && variant != 2 && variant != 3) {
                System.out.println("Неверно введено число. Запустите программу заново");
            }


        }
    }
