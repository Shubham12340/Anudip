package junitpack;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import projectmumbai3.Calculator;

public class CalciTest 
{
	@Test
	public void testadd() 
	{
		assertEquals(12,Calculator.add(6,6));
		assertEquals(10,Calculator.add(6,4));
	}
	
	@Test
	public void testsub() 
	{
		assertEquals(3,Calculator.sub(6,3));
		assertEquals(-4,Calculator.sub(6,10));
	}
	
	@Test
	public void testMul() 
	{
		assertEquals(18,Calculator.Mul(6,3));
		assertEquals(-60,Calculator.Mul(6,-10));
	}
	
	@Test  
    public void testDiv()
	{   
		assertEquals(3,Calculator.div(6,2));
    }
	
	@Test
    public void testDivideByZero() 
	{
		try
		{
			Calculator.div(6, 0);
		}
        catch (ArithmeticException e) 
		{
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
