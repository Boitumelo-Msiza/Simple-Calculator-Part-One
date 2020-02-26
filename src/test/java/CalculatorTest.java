import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class CalculatorTest {



    @Test
    public void sumAll() {

        int num;
        int addition = 0;
        int count = 1;
        do{

            String input = JOptionPane.showInputDialog("Enter number " + count);

            num = Integer.parseInt(input);

            addition = addition + num;
            count++;

        }while (num!= 00);
        Assert.assertEquals(8, addition);
    }

    @Test
    public void MultiplyAll() {
        int num;
        int multiply = 1;
        int count = 1;
        do{

            String input = JOptionPane.showInputDialog("Enter number " + count);

            num = Integer.parseInt(input);

            if(num != 00){
                multiply = multiply * num;
            }

            count++;

        }while (num!= 00);
        Assert.assertEquals(8, multiply);
    }

}
