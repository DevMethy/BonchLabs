package com.company;

import java.util.Scanner;
import java.util.Random;

class Main {

    private static final String DICT = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";
    private static Random random = new Random();

    public static String generate(int length) {
        StringBuilder sb = new StringBuilder();

        for ( ; length > 0; --length )
            sb.append(DICT.charAt(random.nextInt(DICT.length())));

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            System.out.print("Введите длину пароля: ");
            if ( ! scanner.hasNextInt() )
                break;
            int length = scanner.nextInt();
            if ( length < 6 || length > 20)
                break;
            System.out.println("Ваш пароль: " + generate(length));
        }
    }
}
