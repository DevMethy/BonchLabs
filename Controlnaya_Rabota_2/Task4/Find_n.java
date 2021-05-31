package com.company;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите исходное число k: ");
        int k = scan.nextInt();
        int sum_k =0;
        boolean foo = true;
        for (int i = 1; i < k; i++)
        {
            sum_k += i;
            if (sum_k == k)
            {
                System.out.println("Искомое n={0}: " + i);
                foo = false;
                break;
            }
        }
        if(foo == true) System.out.println("такого числа n нет");
    }
}
