package com.company;

public class Zavd3 {
    public static void main(final String[] args) {
        final int[] arrayInt = {9, 9, 9, 9, 9, 9, 9, 9,};
        final char[] arrayChar = {'b', 'a', 'n', 'd', 'a','n','a'};
        printString (arrayInt,arrayChar);
    }

    public static String recordTwoArraysInString(final int[] arrayInt, final char[] arrayChar) {
        final int maxLength;

        if ( arrayChar.length>= arrayInt.length) {
            maxLength = arrayChar.length;
        } else {
            maxLength = arrayInt.length;
        }


        String result = "";
        for (int i = 0; i < maxLength; i++) {
            if (i < arrayInt.length) {
                result += arrayInt[i];
            }
            if (i < arrayChar.length) {
                result += arrayChar[i];
            }
        }
        return result;
    }


    public static void printString(final int[] intArr, final char[] chArr){
        System.out.println (recordTwoArraysInString (intArr,chArr));

    }
}
