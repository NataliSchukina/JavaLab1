package com.epam.nataliya_shchukina.lesson1.task3;

import java.util.Scanner;

public class Application {
    /* реализация приложения */

    public void runApplication() {    // Запуск приложения

        Scanner scanner = new Scanner(System.in);
        String inputString;
        СalcProcessing calcProcessing = new СalcProcessing();

        do {

            try {
                System.out.println("Enter the first value:");           // ввод первого операнда
                float value1 = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the required operation:");    // ввод операции
                String operation = scanner.nextLine();
                System.out.println("Enter the second value:");          // ввод второго операнда
                float value2 = Float.parseFloat(scanner.nextLine());

                if ( operation.equals("/") & value2 == 0) {            // проверка деления на ноль
                    throw new Exception("Division by zero is disallowed.");
                }

                float result = calcProcessing.GetResult(operation, value1, value2);
                String r1 = Float.toString(result);
                System.out.println("Result is = " +  r1);              // вывод результата операции
            } catch (Exception ex) {
                System.out.println("An error occurred: " + ex.getMessage());  // вывод сообщения об ошибке
            }
            System.out.println("Would you like to perform another operation(y/n)?");
            inputString = scanner.nextLine();

        } while (inputString.equals("y"));
    }

}
