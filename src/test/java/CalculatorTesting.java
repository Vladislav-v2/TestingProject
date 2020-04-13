import org.junit.*;
import org.junit.runners.JUnit4;

public class CalculatorTesting
{
    private Calculator calc;
    @Before
    public void BeforeAction()
    {
        calc = new Calculator();
    }
    @After
    public void AfterCation()
    {
        calc = null;
    }

    @Test
    public void TestAddition()
    {
        Assert.assertEquals(12, calc.Addition(3,9),0.0000000001 );
        Assert.assertEquals(-122, calc.Addition(90,-212),0.0000000001 );
        Assert.assertEquals(12.4, calc.Addition(7.2,5.2),0.0000000001 );
        Assert.assertEquals(74.015, calc.Addition(59.2,14.815),0.0000000001 );
        Assert.assertEquals(-3.2, calc.Addition(-3.32,0.12),0.0000000001 );
    }

    @Test
    public void TestDifference()
    {
        Assert.assertEquals(5.3,calc.Difference(4,-1.3),0.0000000001 );
        Assert.assertEquals(12.6,calc.Difference(19.1,6.5),0.0000000001 );
        Assert.assertEquals(-0.132,calc.Difference(1.242,1.374),0.0000000001 );
        Assert.assertEquals(59,calc.Difference(41,-18),0.0000000001 );
        Assert.assertEquals(-13.13,calc.Difference(145.3,158.43),0.0000000001 );
    }
    @Test
    public void TestMultiply()
    {
        Assert.assertEquals(4.2, calc.Multiply(2.1,2),0.0000000001 );
        Assert.assertEquals(-16, calc.Multiply(-4,4.0),0.0000000001 );
        Assert.assertEquals(6.8175, calc.Multiply(25.25,0.27),0.0000000001 );
        Assert.assertEquals(0, calc.Multiply(0,15.234),0.0000000001 );
        Assert.assertEquals(12, calc.Multiply(12,1),0.0000000001 );
        Assert.assertEquals(1705.25, calc.Multiply(1795,0.95),0.0000000001 );
    }


    @Test(timeout = 200)
    @Ignore
    public  void TestDivision()
    {
        Assert.assertEquals(5.2, calc.Division(15.6, 3),0.0000000001);
        Assert.assertEquals(12,calc.Division(6,0.5), 0.0000000001);
    }
}
