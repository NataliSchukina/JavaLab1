package com.epam.nataliya_shchukina.lesson1.task1;

 public class Application {
        /*  Реализация приложения с массивом чисел вариант 1 */

    public int [] arrayInitionalization( int size, int leftBorder, int rightBorder){    // Создание массива
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (rightBorder-leftBorder + 1))+leftBorder;
        }
        return array;
    }

    public void runApplication() {       // работа приложения

        ArrayProcessing arrayProcessing = new ArrayProcessing();
        var array = arrayInitionalization(20, -10, 10);  // Содаем массив
        System.out.println("Original array:");
        arrayProcessing.arrayOutput(array);
        System.out.println();

        var negativeIndex = arrayProcessing.getMaxNegativeIndex(array);  // Получаем макимальный отрицательный элемент
        System.out.println("Maximum negative element of the array is: " +
                array[negativeIndex] + " [" + negativeIndex + "]");

        var positiveIndex = arrayProcessing.getMinPositiveIndex(array); // Получаем минимальный положительный элемент
        System.out.println("Minimum positive element of the array is " +
                array[positiveIndex] + " [" + positiveIndex + "]");

        var changingArray = arrayProcessing.changeElementInArray(array,negativeIndex,positiveIndex);
        // Вывод измененного массива
        System.out.println("Modified array:");
        arrayProcessing.arrayOutput(changingArray);
    }
}