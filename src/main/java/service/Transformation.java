package service;

import model.Calculator;
import model.Result;

public class Transformation {
    private Loggable loggable = new ConsoleLogger();
    private Calculator calculator =  new Calculator();
    public Result binaryTransform(String str) {
        loggable.log(" Перевод в бинарную систему:");
        Result result = new Result();
        result.setResultBinary(calculator.toBinaryString(str));
        return result;
    }
}
