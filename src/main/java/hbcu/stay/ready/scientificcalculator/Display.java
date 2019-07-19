package hbcu.stay.ready.scientificcalculator;
import java.util.*;

public class Display {



    private double currentNumber;


    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
        currentNumber = 0;

    }
            public double getCurrentNumber(){
        return currentNumber;


    }

    public void clear() {
       this.currentNumber= 0;


    }
}


































