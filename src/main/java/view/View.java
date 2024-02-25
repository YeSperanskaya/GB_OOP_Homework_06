package view;

import model.Result;

public class View {

    public void printResult(Result result){
        System.out.println(result.getResult());

    }
    public void printBinaryResult(Result result){
        System.out.println(result.getResultBinary());

    }
}
