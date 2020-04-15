public class Calculator {

    public double Addition (double a, double b)
    {
        return  a + b;
    }

    public  double Difference (double a, double b)
    {
        return a - b;
    }

    public  double Multiply (double a, double b)
    {
        return  a * b;
    }

    public  double Division (double a, double b)
    {
        if (b != 0) return a / b; else
        throw new IllegalArgumentException();
    }

    public  double Sqrt (double a)
    {
        if(a >= 0)
            return Math.sqrt(a);
        else throw new IllegalArgumentException();
    }

    public double Square(double a)
    {
        return a * a;
    }

}
