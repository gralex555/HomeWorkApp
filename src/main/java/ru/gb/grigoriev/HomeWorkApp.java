package ru.gb.grigoriev;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    private static void  compareNumbers() {
        int a;
        a = 20;
        int b;
        b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }


    private static void printColor() {
        int value;
        value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");

        } else {
            System.out.println("Зеленый");

        }

    }





    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a;
        a = -175;
        int b = 15;
        int summ = a + b;
        if (summ >= 0) {
            System.out.println("summ positive");

        } else {
            System.out.println("summ negative");
        }
    }

}
