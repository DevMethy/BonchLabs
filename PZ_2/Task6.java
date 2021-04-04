package com.company;

class Main {

    public static void main(String[] args) {

        char ch = 'S';

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);


        char ch1 = '9';

        // c использованием метода getNumericValue
        // класса Character
        int i1 = Character.getNumericValue(ch1);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(ch1,10);
        System.out.println(i2);


    }

}
