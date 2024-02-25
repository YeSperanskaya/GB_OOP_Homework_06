package service;

import model.Calculator;
import model.Result;

public class Division {
    private Loggable loggable = new ConsoleLogger();
    private Calculator calculator =  new Calculator();
    public Result division(double num1, double num2) {
        loggable.log(" Операция деления");
        Result result = new Result();
        result.setResult(calculator.division(num1,num2));
        return result;
    }
}
