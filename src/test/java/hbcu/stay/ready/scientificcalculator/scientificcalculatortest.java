package hbcu.stay.ready.scientificcalculator;

import org.junit.Test;

public class scientificcalculatortest {

    @Test
    public void switchDisplayModeoctal(){
       Display octal = new Display();

       octal.setCurrentNumber(776);

       String Octal = Integer.toOctalString((int)(octal.getCurrentNumber()));

       System.out.print(Octal);


    }

    @Test
    public void switchDisplayModehexa(){
        Display hexa = new Display();

        hexa.setCurrentNumber(45.00);

        String Hexa = Integer.toHexString((int)(hexa.getCurrentNumber()));


        System.out.print(Hexa);



    }
}