package service;

import model.Result;

public class CalculateFactory {
    public Result calculate(double num1, double num2, char symb){
        switch (symb){
            case '+':
                return new Addition().addition(num1, num2);
            case '-':
                return new Subtraction().addition(num1, num2);
            case '*':
                return new Multiplication().multiplication(num1, num2);
            case '/':
                return new Division().division(num1, num2);

            default:
                System.out.println("Вы ввели неверный символ!");
                Result result = new Result();
                result.setResult(0.0);
                return result;
        }




    }

    public Result binary(String str) {
        return new Transformation().binaryTransform(str);
    }

    public CalculateFactory() {
    }
}
