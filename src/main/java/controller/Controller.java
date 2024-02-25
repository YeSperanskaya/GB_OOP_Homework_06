package controller;

import service.CalculateFactory;
import view.View;


public class Controller {
    private double num1;
    private double num2;
    private String str;
    private CalculateFactory calculateFactory = new CalculateFactory();
    private View view = new View();

//    public Controller(double num1, double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//    public Controller


    public void start(){

        view.printResult(calculateFactory.calculate(10.0,2.0,'-'));
        view.printResult(calculateFactory.calculate(10.0,2.0,'+'));
        view.printResult(calculateFactory.calculate(10.0,2.0,'*'));
        view.printResult(calculateFactory.calculate(10.0,5.0,'/'));
        view.printBinaryResult(calculateFactory.binary("1256"));




    }

}
