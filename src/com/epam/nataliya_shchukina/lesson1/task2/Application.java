package com.epam.nataliya_shchukina.lesson1.task2;

import java.util.Scanner;

public class Application {
    /* Реализация приложения  по обработке строкового массива вариант 1 */

    public void runApplication() {

        ApplicationProcessing stringAppProcessing = new ApplicationProcessing();
        var stringArray = stringAppProcessing.stringArrayInit();
        stringAppProcessing.getMinString(stringArray);
        stringAppProcessing.getMaxString(stringArray);
    }
}

