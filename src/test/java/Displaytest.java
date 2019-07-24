import hbcu.stay.ready.scientificcalculator.Calculator;
import hbcu.stay.ready.scientificcalculator.Display;
import org.junit.Assert;
import org.junit.Test;

public class Displaytest {

    @Test
    public void setCurrentNumberTest() {
        Display display = new Display();
        display.setCurrentNumber(5);
        double actual = display.getCurrentNumber();

        double expected = 5;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.println(actual);
    }

    @Test
    public void getCurrentNumberTest() {
        Display display = new Display();

        double actual = display.getCurrentNumber();

        double expected = 0;

        Assert.assertEquals(expected, actual, 0.0);
        System.out.println(actual);
    }

    @Test
    public void cleartest() {
        Display display = new Display();

        display.clear();

    }
}


