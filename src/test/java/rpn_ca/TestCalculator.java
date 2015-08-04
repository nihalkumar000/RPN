package rpn_ca;

import junit.framework.TestCase;



public class TestCalculator extends TestCase{

	public void firstSecondExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("9.0"),calculator.eval("5 3 1 + +"));
		
	}

	
	public void testFirstExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-999"),calculator.eval("5 +"));
	}
	
	
	public void testSecondExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-999"),calculator.eval("+ 3"));
	}
	public void testThirdExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-2.0"),calculator.eval("2 1 5 + - 3 * 6 /"));
		
	}
	public void testFourthExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("1.0"),calculator.eval("2 1 5 ^ - 3 * 3 /"));
		
	}
	public void testFifthExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("1.0"),calculator.eval("2 1 5 ^ - 3 * 3 / 100 * %"));
		
	}
	public void testSixthExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-999.0"),calculator.eval("2 1 5 ^ - 3 3 / 100 * %"));
		
	}
	public void testSeventhExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-999.0"),calculator.eval("Nihal 1 Shubham ^ - 3 * 3 / 100 * %"));
	}
	
	public void testEighthExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-999"),calculator.eval("5 0 /"));
	}
	
	public void testExample()
	{
		Calculator calculator = new Calculator();
		assertEquals(Float.parseFloat("-999"),calculator.eval(""));
	}
	
}
