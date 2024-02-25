package service;

import model.Calculator;
import model.Result;

import java.util.List;

public class Addition {
    private Loggable loggable = new ConsoleLogger();
    private Calculator calculator =  new Calculator();

    public Result addition(double num1, double num2) {
        loggable.log(" Операция сложения");
        Result result = new Result();
        result.setResult(calculator.sum(num1,num2));
        return result;


    }
}
