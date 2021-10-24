package com.company;

public class Zavd1 {


    static void printArrayString(final String[] str)
    {
        for (final String value : str) {
            System.out.print(value+" ");
        }
    }
    static void sortArrayString(final String[] str)
    {
        for(int i = 1; i < str.length; i++) {
            for(int j = 0; j < i; j++) {
                if(str[j].length() > str[j+1].length()) {
                    final String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
    }
    public static void main(final String[] args) {
        final String[] arr = {"dd", "aaaa", "sss", "eeeeee", "j", "oo", "pppp", "xxxxx", "wwwwwwww"};
        sortArrayString (arr);
        printArrayString (arr);

    }
}
