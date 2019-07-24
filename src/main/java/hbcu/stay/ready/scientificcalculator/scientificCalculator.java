package hbcu.stay.ready.scientificcalculator;

public class scientificCalculator extends Calculator {




    public void switchDisplayMode(String mode) {

        Display octal = new Display();

        String Octal = Integer.toOctalString((int) Math.round(octal.getCurrentNumber()));
    }

    Display hexa = new Display();

    String Hexa = Integer.toHexString((int) Math.round(hexa.getCurrentNumber()));

    }

