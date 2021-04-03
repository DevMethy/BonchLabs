package com.company;

import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Введите три номера!");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if ((num1 < 5 && num2 < 5) || (num2 < 5 && num3 < 5) || (num1 < 5 && num3 < 5)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
