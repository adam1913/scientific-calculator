package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class Calculatortest {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }



    @Test
    public void addtest() {



        double actual =  calculator.add(20);

        double expected = 20.0;
        Assert.assertEquals(expected, actual, 0.0);

        System.out.print(actual);

    }

    @Test
    public void subtracttest() {


       double actual = calculator.subtract(5);

        double expected = -5.0;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);

    }

    @Test
    public void dividetest() {


        double actual = calculator.divide(10);

        double expected = 2.0;


        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);


    }

    @Test
    public void multiplytest(double value) {

        double actual = calculator.multipy(value);


        double expected = 50.0;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);


    }

    @Test
    public void squaretest() {


        double actual = calculator.square();
        double expected = 25;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);


    }

    @Test
    public void squareroottest() {



        Double actual = calculator.square();
        double expected = 5;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.println(actual);
    }
    @Test
    public void divideerrortest() {


        double actual = calculator.divide(0);

        double expected = 0;


        Assert.assertEquals(expected, actual, 0.0);
        System.out.print(actual);
    }

}
