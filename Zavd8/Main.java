package com.company.Zavd8;

public class Main {
    public static void main(final String[] args) throws Exception {
        final CustomDouble customDouble1 = new CustomDouble (2, 6.7);
        final CustomDouble customDouble2 = new CustomDouble (-6, 11.5);



        System.out.println ("Число 1: " +customDouble1);
        System.out.println ("Число 2: " +customDouble2);



        System.out.println ("Ділення: = "+customDouble1.division (customDouble2));
        System.out.println ("Додавання = "+customDouble1.addition (customDouble2));
        System.out.println ("Віднімання =  "+customDouble1.subtraction (customDouble2));



        customDouble1.comparison (customDouble2);
        System.out.println (customDouble1.equals (customDouble2));
        System.out.println (customDouble2.hashCode ());
    }
}

