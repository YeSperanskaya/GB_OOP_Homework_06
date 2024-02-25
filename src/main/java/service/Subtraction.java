package service;

import model.Calculator;
import model.Result;

public class Subtraction extends Addition{
    private Loggable loggable = new ConsoleLogger();
    private Calculator calculator =  new Calculator();
    public Result addition(double num1, double num2) {
        loggable.log(" Операция вычитания");
        Result result = new Result();
        result.setResult(calculator.minus(num1,num2));
        return result;
    }
}
