package com.epam.nataliya_shchukina.lesson1.task1;

public class ArrayProcessing {
    /* операция с массивом */

    public void arrayOutput(int[] array) {      // вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "[" + i + "]" + " ");
        }
    }

    public int getMaxNegativeIndex(int[] array) {    // получаем индекс максимального отрацательного цисла массива
        int maxNegative = Integer.MIN_VALUE + 1;
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(array[i])< Math.abs(maxNegative)) && (array[i] < 0)){
                maxNegative = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public int getMinPositiveIndex(int[] array) {    //получаем индекс минимального положительного цисла массива
        int minPositive = Integer.MAX_VALUE;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if((array[i] < minPositive) && (array[i] > 0)) {
                minPositive = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public int[] changeElementInArray(int[] array, int k, int l) {    //меняем элементы массива
        int temparray = array[k];
        array[k] = array[l];
        array[l] = temparray;
        return array;
    }
}
