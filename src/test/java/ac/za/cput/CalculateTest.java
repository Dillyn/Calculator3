package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void calculate(){
        Calculate calc = new Calculate();

        Assert.assertEquals(0,calc.subtract(5,5));

    }
}
