package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;


public class Calculatortest {


    @Test
    public void addtest() {
        Calculator calculator = new Calculator();

        calculator.add(15);

        double actual = calculator.display.getCurrentNumber();
        double expected = 15.0;
        Assert.assertEquals(expected, actual, 0.0);

        System.out.print(actual);

    }

    @Test
    public void subtracttest() {
        Calculator calculator = new Calculator();

        calculator.subtract(5);
        double actual = calculator.display.getCurrentNumber();
        double expected = -5.0;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);

    }

    @Test
    public void dividetest() {

        Calculator calculator = new Calculator();
        calculator.display.setCurrentNumber(20);
        calculator.divide(10);
        double actual = calculator.display.getCurrentNumber();
        double expected = 2.0;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);


    }

    @Test
    public void multiplytest() {
        Calculator calculator = new Calculator();
        calculator.display.setCurrentNumber(5);
        calculator.multipy(10);
        double actual = calculator.display.getCurrentNumber();
        double expected = 50.0;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);


    }
    @Test
    public void squaretest() {
        Calculator calculator = new Calculator();

        calculator.display.setCurrentNumber(5);
        calculator.square();
        double actual = calculator.display.getCurrentNumber();
        double expected = 25;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);


    }
}
