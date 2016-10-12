package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) throws Exception {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() throws Exception{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() throws Exception{
	  assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoStrings() throws Exception{
	  assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testMultipleNumbers() throws Exception{
	    assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testNewLine() throws Exception{
			assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegatives() throws Exception{
		try{
			assertEquals(6, Calculator.add("-1,2"));
		}
		catch (Exception e) {
			assertEquals("Negatives not allowed: -1", e.getMessage());
		}
	}

	@Test
	public void testBiggerThanThousand() throws Exception{
			assertEquals(2, Calculator.add("1001,2"));
	}

	@Test
	public void testChangedDelimiter() throws Exception{
			assertEquals(3, Calculator.add("//;\n1;2"));
	}
}
