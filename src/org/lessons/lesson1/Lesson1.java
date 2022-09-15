package org.lessons.lesson1;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World");


            // код ->(компиляция) jvm -> bite code

            //Примитивные типы данных
            boolean b = true;
            boolean b2 = false;
            // логическое значение - да или нет

            //byte (8 бит или 8 значений 1 или 0)
            byte bt = -128;
            byte bt2 = 127;

            //short (2 byte)
            short sh = -32_768;
            short sh2 = 32+767;

            //int - целое число (4 byte или 32 bit)
            int integer = -2_100_000_000;
            int integer2 = 2_100_000_000;

            //long - длинное целое число (8 byte ли 64 bit)
            long lon = 3_000_000_000_000_000_000L;

            //Числа с плавающей точкой
            float floa = 3.1234567f;

            //double
            double doub = 3.123456789;

            int x = 4;
            int y = 2;
            int c = x - y;
            int c2 = x + y;
            int c3 = x * y;
            int c4 = x / y;
            int c5 = x % y;  //остаток от деления
            System.out.println(c);

            //Символы
            char ch = 'l';
            char ch2 = 123;
            System.out.println(ch);

            char[] answer2 = new char [6];
            answer2[0] = 'м';
            answer2[1] = 'о';
            answer2[2] = 'т';
            answer2[3] = 'ы';
            answer2[4] = 'г';
            answer2[5] = 'a';

            System.out.println(answer2);

            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));

            //Текстовый тип данных
            String word1 = "hello";
            String word2 = "world!";
            String result = word1 + word2; //Конкатенация - объединение строк
            System.out.println(result);

            String stringfromCharArray = String.valueOf(answer2);

            System.out.println(word1.repeat(10));




    }
}
