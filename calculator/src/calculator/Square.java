package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Square {

	@Test
	public void test() 
	{
		calculator obj1=new calculator();
		int output_f=obj1.square(4);
		//Test output
		assertEquals(16,output_f);
	}

}
