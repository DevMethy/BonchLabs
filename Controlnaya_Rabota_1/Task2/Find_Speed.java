package com.company;

import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Введите время(в минутах) и расстояние(в километрах)");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = scan.nextInt();
        t = t * 60 ;
        s = s * 1000;
        int v = s/t;
        System.out.println("Скорость равна:" + v + "м/c");
    }
}
