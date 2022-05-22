package ru.gb.grigoriev.HomeWork3;

public class HomeWork3 {

    public static void main(String[] args) {
        arr1();
        arr2();
    }

    public static void arr1() {


        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("cell " + i + " change to " + arr[i]);
        }

    }
    
    public static void arr2() {

        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;

        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "    ");
        }

    }
}








