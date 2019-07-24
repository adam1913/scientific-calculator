package hbcu.stay.ready.scientificcalculator;

import java.util.*;

public class Calculator {

    Display display = new Display();


    public Double add(double value) {
        Double number = display.getCurrentNumber();
        number += value;
        return number;
    }

    public Double subtract(double value) {
        Double number = display.getCurrentNumber();
        number -= value;

        return number;
    }


    public Double divide(double value) {
        Double number = display.getCurrentNumber();
        if (0.0 == number) {
            System.out.print("Err");
        } else {
            number /= value;
        }

            return number;
    }

        public Double multipy(double value) {
            Double number = display.getCurrentNumber();
            number *= value;

            return number;
    }
    public Double square () {
        Double number = display.getCurrentNumber();
        number = Math.pow(number,2);

        return number;
    }

    public void squareroot () {
        Double number = display.getCurrentNumber();
        number = Math.sqrt(number);

    }
}



