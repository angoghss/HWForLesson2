package com.company;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(qwe(10));
        sumDouble(2, 3);
    }

    public static boolean qwe(int a) {
        if (a % 3 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumDouble(int a, int b) {
        int x;
        if (a == b) {
            x = (a + b) * 2;
            System.out.println("Value: " + x);
            return x;
        } else {
            x = a + b;
            System.out.println("Value: " + x);
            return x;
        }

    }

}

