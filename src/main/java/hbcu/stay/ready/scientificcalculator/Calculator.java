package hbcu.stay.ready.scientificcalculator;

import java.util.*;

public class Calculator {

    Display display = new Display();




        public void add(double currentNumber) { display.setCurrentNumber(display.getCurrentNumber() + currentNumber);

        }

        public void subtract(double currentNumber) { display.setCurrentNumber(display.getCurrentNumber() - currentNumber);
        }

        public void divide(double number) {
            display.setCurrentNumber(display.getCurrentNumber() / number);
        }

        public void multipy(double number) { display.setCurrentNumber(display.getCurrentNumber()* number);

        }

        public void square() { display.setCurrentNumber(Math.pow(display.getCurrentNumber(),2));

        }
    }