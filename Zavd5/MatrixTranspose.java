package com.company.Zavd5;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Матриця ");
        System.out.print("Кількість рядків: ");
        final int row = scanner.nextInt();
        System.out.print("Кількість колонок: ");
        final int column = scanner.nextInt();


        System.out.println("\n ВВЕСТИ МАТРИЦЮ: ");
        final Matrix matrix = new Matrix(row, column);
        matrix.read(scanner);
        System.out.println("Матриця: ");
        matrix.printMatrix ();
        matrix.transposeMatrix ();
        System.out.println("Транспортована матриця: ");
        matrix.printMatrix ();
        scanner.close();
    }

}
