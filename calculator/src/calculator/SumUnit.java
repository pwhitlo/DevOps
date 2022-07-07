package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumUnit {

	@Test
	public void test() {
		//Create new object of calculator class
		calculator obj2=new calculator();
		int output_x=obj2.sum(4,8);
		//Test output
		assertEquals(12,output_x);
	}

}
