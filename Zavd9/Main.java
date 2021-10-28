package com.company.Zavd9;



import java.util.Scanner;



public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner (System.in);
        System.out.print("Введіть ПЕРШЕ число: ");
        final double number1 = scanner.nextDouble ();
        System.out.print("Введіть ДРУГЕ число: ");
        final double number2 = scanner.nextDouble ();
        System.out.print("Виберіть дію +,  -, *, / ");
        final char char1 = (char) System.in.read ();






        System.out.println (Calculator.calculatorChange (number1,number2,char1));

    }
}

