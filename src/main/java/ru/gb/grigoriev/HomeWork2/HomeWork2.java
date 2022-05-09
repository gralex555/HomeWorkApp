package ru.gb.grigoriev.HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        checkSum();
        number(100500);
        System.out.println(number2(5));
        hello("Hi", 7);
        System.out.println(year(300));


    }

    private static void checkSum() {
        int a;
        a = 5;
        int b;
        b = 6;
        int sum;
        sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void number(int a) {
        if (a >= 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }

    }

    public static boolean number2(int c) {
        return c < 0;


    }

    public static void hello(String name, int k) {
        for (int i = 3; i < k; i++) {
            System.out.println(name);

        }

    }

    public static boolean year(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

}
