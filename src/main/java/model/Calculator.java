package model;

import java.util.List;
import java.util.Objects;

/**
 * +1)расширить класс калькулятор на умножение
 * +2)расширить класс калькулятор на деление
 */
public class Calculator {


    public double sum(double num1, double num2) {
       return num1+num2;
    }


    public double minus(double num1, double num2) {
        return num1-num2;
    }


    public double multiplication(double num1, double num2) {
        return num1*num2;
    }

    public double division(double num1, double num2) {
        try {
            double res = num1/num2;
        } catch (ArithmeticException e) {

            System.out.println("division by zero");
            return 0.0;
        }
        return num1/num2;
    }

    /**
     * @apiNote переводит строку с числами в строку в бинннарном коде
     * @param str строка
     * @return строку бинарный код
     */
    public String toBinaryString(String str) {
        int num = stringIntoInteger(str);
        return Integer.toString(num,2);
    }

    /**
     * @apiNote переводит строку с плавающей точкой в интеджер
     * @param string принимаемое значение
     * @return интеджер, убирает точку и все значения после нее
     */
    private Integer stringIntoInteger(String string) {
        if (string.contains(".")) {
            string = string.substring(0, string.indexOf('.'));
            //String strLittle = string.split(".")[0];
            return Integer.valueOf(string);
        } else {
            return Integer.valueOf(string);
        }
    }

}
