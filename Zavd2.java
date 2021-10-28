package com.company;

public class Zavd2 {


    public static int countChar(final String string, final char c)
    {
        int res = 0;
        for (int i=0; i<string.length(); i++)
        {

            if (string.charAt(i) == c){
                res++;
            }
        }
        return res;
    }

    static void printNumberOfChar(final String string, final char c)
    {
        System.out.println ( "Total number of char: \""+c+"\" " + countChar (string,c)) ;
    }

    public static void main(final String[] args)
    {
        final String string =  "running through the woods and break your face" ;


        final char c = 'n';




        System.out.println (string);
        printNumberOfChar (string,c);
    }



}


