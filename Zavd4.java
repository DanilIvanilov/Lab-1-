package com.company;

public class Zavd4 {
    public static void main(String[] args) {
        System.out.println("Program FizzBuzz:");
        for (int i=1; i < 101; i++) {
            if (!(i % 3 == 0 || i % 5 == 0)) System.out.print(i);
            if (i % 3 == 0) System.out.print("Fizz");
            if (i % 5 == 0) System.out.print("Buzz");
            System.out.println();
        }
    }
}