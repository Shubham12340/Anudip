package junitpack;


public class Calci
{
    
    public static int add(int a, int b) 
    {
        return a + b;
    }

    
    public static int sub(int a, int b) 
    {
        return a - b;
    }

    public static int Mul(int a, int b) 
    {
        return a * b;
    }

    public static int div(int a, int b) 
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
