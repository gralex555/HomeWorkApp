package ru.gb.grigoriev;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
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
            System.out.println("positive");

        } else {
            System.out.println("negative");
        }
    }

}
