package service;

import model.Calculator;
import model.Result;

public class Multiplication {
    private Loggable loggable = new ConsoleLogger();
    private Calculator calculator =  new Calculator();
    public Result multiplication(double num1, double num2) {
        loggable.log(" Операция умножения");
        Result result = new Result();
        result.setResult(calculator.multiplication(num1,num2));
        return result;


    }
}

