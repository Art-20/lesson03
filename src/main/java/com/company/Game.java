package com.company;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void game() {
        System.out.println("Привет! Как тебя завут");
        Scanner sc_name = new Scanner(System.in);
        String user_name = sc_name.nextLine();
        System.out.println("Приятно познакомится " + user_name);
        System.out.println(user_name + ", загадай число от 1 до 10");
        System.out.println("Если загадал нажми введи ok");
        Scanner sc_ok = new Scanner(System.in);
        String ok = sc_ok.nextLine();

        if (ok == ok) {

            do {
            Random newRandom = new Random();
        int num = newRandom.nextInt(10);
        System.out.println("Ваше число " + num + " ? Если да, введи y, если нет - n");
            Scanner sc_y = new Scanner(System.in);
            String y = sc_y.nextLine();
            if (y == y) {
                System.out.println("Ура! Я угадал");
            }

            } while (true);

        }


    }





}
