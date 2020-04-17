import org.junit.Assert;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.Console;
import java.util.stream.Stream;

public class CalculatorTesting
{
    private Calculator calc;

    @BeforeEach
    public void BeforeAction()
    {
        calc = new Calculator();
    }
    @AfterEach
    public void AfterCation()
    {
        calc = null;
    }

    static Stream<Arguments> SumSources()
    {
        return Stream.of(
                Arguments.arguments(4,3,7),
                Arguments.arguments(3,9,12),
                Arguments.arguments(90.0,-212,-122),
                Arguments.arguments(7.2,5.2,12.4),
                Arguments.arguments(59.2,14.815,74.015),
                Arguments.arguments(-3.32,0.12,-3.2)
        );
    }
    static Stream<Arguments> DiffSources()
    {
        return Stream.of(
                Arguments.arguments(4,-1.3,5.3),
                Arguments.arguments(19.1,6.5,12.6),
                Arguments.arguments(1.242,1.374,-0.132),
                Arguments.arguments(41,-18, 59),
                Arguments.arguments(145.3,158.43,-13.13)
        );
    }
    static Stream<Arguments> MultyplySources()
    {
        return Stream.of(
                Arguments.arguments(2.1,2,4.2),
                Arguments.arguments(-4,4.0,-16),
                Arguments.arguments(25.25,0.27,6.8175),
                Arguments.arguments(0,15.234,0),
                Arguments.arguments(12,1,12),
                Arguments.arguments(1795,0.95,1705.25),
                Arguments.arguments(26,0,0)
                );
    }
    static Stream<Arguments> DivisionSources()
    {
        return Stream.of(
//                Arguments.arguments(15.5,5,3.1),
//                Arguments.arguments(49.7,7.0,7.0),//negative
//                Arguments.arguments(9,9.0,1),
//                Arguments.arguments(4,15.234,0),//negative
//                Arguments.arguments(75,25,3.0),
                Arguments.arguments(-64 ,0, 1), //negative
                Arguments.arguments(60 ,12, 5), //negative
                Arguments.arguments(15 ,4, 5),
                Arguments.arguments(-18 ,-9, 2),
                Arguments.arguments(448 ,14, 32),
                Arguments.arguments(4 ,0, 0)
        );
    }
    static Stream<Arguments> SqrtSources()
    {
        return Stream.of(
                Arguments.arguments(81.0,9),
                Arguments.arguments(16,4.1),//negative test
                Arguments.arguments(4.0,2.0),
                Arguments.arguments(30.25,5.5),
                Arguments.arguments(144,12.00001),
                Arguments.arguments(0.0,0)
        );
    }
    static Stream<Arguments> SquareSources()
    {
        return Stream.of(
                Arguments.arguments(9,81.0),
                Arguments.arguments(4, 16.0),
                Arguments.arguments(2.4,5.76),
                Arguments.arguments(-14, 196),
                Arguments.arguments(0,0.1), //negative test
                Arguments.arguments(5.5, 30.25)
        );
    }

    @ParameterizedTest
    @MethodSource("SumSources")
    public void TestAddition(double a, double b, double expRes)
    {
          Assert.fail();//set failed test
          assertEquals(expRes, calc.Addition(a,b),0.0000000001 );
    }

    @ParameterizedTest
    @MethodSource("DiffSources")
    public void TestDifference(double a, double b, double expRes)
    {
        assertEquals(expRes, calc.Difference(a,b),0.0000000001 );
    }

    @ParameterizedTest
    @MethodSource("MultyplySources")
    public void TestMultiply(double a, double b, double expRes)
    {
        assertEquals(expRes, calc.Multiply(a,b),0.0000000001 );
    }

    @ParameterizedTest
    @MethodSource("DivisionSources")
    public  void TestDivision(int a, int b, int expRes)
    {
        try {
            assertEquals(expRes, calc.Division(a, b));
        }catch (ArithmeticException ex)
        {
            Assert.fail("Exception - test failed");
        }
    }

    @ParameterizedTest
    @MethodSource("SqrtSources")
    @Disabled
    @Timeout(100)
    public  void TestSqrt(double a, double expRes)
    {
        assertEquals(expRes, calc.Sqrt(a),0.0000000001);
    }

    @ParameterizedTest
    @MethodSource("SquareSources")
    public  void TestSquare(double a, double expRes)
    {
        assertEquals(expRes, calc.Square(a),0.0000000001);
    }
}