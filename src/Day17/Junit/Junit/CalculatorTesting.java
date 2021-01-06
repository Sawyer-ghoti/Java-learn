package Day17.Junit.Junit;


import Day17.Junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTesting {

    @Test
    public void testAdd(){
        System.out.println("我被执行了");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(3,result);
    }
}
