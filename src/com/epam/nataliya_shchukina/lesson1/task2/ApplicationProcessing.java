package com.epam.nataliya_shchukina.lesson1.task2;

import java.util.Scanner;

public class ApplicationProcessing {
    /* операция с массивом */

    public String[] stringArrayInit() {     //вводим строковый массив

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the count of strings: ");    // ввод количества строк
        n = scanner.nextInt();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {       // вводим строки
            System.out.print("Input the string " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        return strings;
    }

    public void getMinString ( String [] strArray) {     //получаем строку с минимальной длиной и выводим её
        int stringLengthMin = strArray[0].length() ;
        String strMinLength = strArray[0];
        for (String value : strArray) {

            if (value.length() < stringLengthMin) {
                stringLengthMin = value.length();
                strMinLength = value;
            }
        }
        System.out.println("Minimum length is: " + stringLengthMin);
        System.out.println("String with minimum of length is: " + strMinLength);
    }

    public void getMaxString ( String [] strArray) {      //получаем строку с ммаксимальной длиной и выводим её
        int stringLengthMmax = strArray[0].length() ;
        String strMaxLength = strArray[0];
        for (String value : strArray) {

            if (value.length() >  stringLengthMmax) {
                stringLengthMmax = value.length();
                strMaxLength = value;
            }
        }
        System.out.println("Maximum length is: " + stringLengthMmax);
        System.out.println("String with maximum length is: " + strMaxLength);
    }
}

