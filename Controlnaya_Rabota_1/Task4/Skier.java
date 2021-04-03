package com.company;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstDay = 10;
        double fdayCounter = 0;
        double counter7 = 10;
        double total7 = 0;
        double ndayCounter = 0;
        double ndayResult = 10;
        int toughday = 0;
        System.out.println(firstDay + "Км за 1 день");
        for (int i=2;i<11;i++) {
            fdayCounter = firstDay / 100 * 10;
            firstDay = firstDay + fdayCounter;
            counter7 = counter7 + firstDay;
            System.out.println(firstDay + "Км за " + i + " день");
            if (i == 7) {
                total7 = counter7;
            }
        }
        System.out.println("Всего: " + total7 + "Км за первые 7 дней");
        System.out.println("Введите количество дней");
        double ndays = scan.nextInt();
        for (int j = 0;j<ndays;j++) {
            ndayCounter = ndayResult / 100 * 10;
            ndayResult = ndayResult + ndayCounter;
            if (ndayResult>80) {
                System.out.println("Прекратить увеличивать пробег следует на " + j + "день");
            }
        }
        System.out.println(ndayResult + "Км за " + ndays + " дней");
    }
}
