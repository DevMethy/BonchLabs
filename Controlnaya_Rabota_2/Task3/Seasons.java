package com.company;

import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер месяца от 1 до 12");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        if (t>12 || t<=0) {
            System.out.println("Вы ввели некорректный номер месяца");
        }
            else {
                if (t == 12 || t <= 2) {
                    System.out.println("Зима");
                } else if (t <= 5 && t>=3) {
                    System.out.println("Весна");
                } else if (t <= 8 && t>=6) {
                    System.out.println("Лето");
                } else if (t <= 11 && t>=9) {
                    System.out.println("Осень");
                }
            }
    }
}
