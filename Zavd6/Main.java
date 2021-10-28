package com.company.Zavd6;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Матриця 1 ");
        System.out.print("Кількість рядків: ");
        final int row1 = scanner.nextInt();
        System.out.print("Кількість колонок: ");
        final int column1 = scanner.nextInt();
        System.out.println("\n Елементи матриці:");
        final Matrix matrixFirst = new Matrix (row1, column1);
        matrixFirst.readMatrix ();



        System.out.println("Матриця 2 ");
        System.out.print("Кількість рядків: ");
        final int row2 = scanner.nextInt();
        System.out.print("Кількість колонок: ");
        final int column2 = scanner.nextInt();
        System.out.println("\n Елементи матриці:");
        final Matrix matrixSecond = new Matrix (row2, column2);


        matrixSecond.readMatrix ();




        final Matrix matrixMultiply = matrixFirst.multiplyMatrix (matrixSecond);




        System.out.println("Матриця 1: ");
        matrixFirst.printMatrix ();
        System.out.println("Матриця 2: ");
        matrixSecond.printMatrix ();
        System.out.println("Добуток матриць: ");
        matrixMultiply.printMatrix ();
        scanner.close();
    }

}


