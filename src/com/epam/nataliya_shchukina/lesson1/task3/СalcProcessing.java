package com.epam.nataliya_shchukina.lesson1.task3;

public class СalcProcessing {

    static float GetResult(String operation,float value1,float value2) throws Exception {
        /* получаем результат операции */

        switch (operation)     // выбор расчета результата в зависимости от операции
        {
            case "+":
                return СalcProcessing.AdditionalResult(value1,value2);


            case "-":
                return СalcProcessing.SubtractionResult(value1,value2);

            case "*":
                return СalcProcessing.MultiplayResult(value1,value2);

            case "/":
                return СalcProcessing.DivisionResult(value1,value2);

            default:
                throw new Exception("This statement is not supported.");  // ошибка если оперция выбрана некорректно
        }
    }

    static float AdditionalResult (float value1, float value2) {          //операция сложения
        return value1 + value2;
    }

    static float SubtractionResult (float value1, float value2){          //операция вычитания
        return value1 - value2;
    }

    static float MultiplayResult (float value1, float value2) {           //операция умножения
        return value1 * value2;
    }

    static float DivisionResult (float value1, float value2) {           //операция деления
        return value1 / value2;
    }
}
