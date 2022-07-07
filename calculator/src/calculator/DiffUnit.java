package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiffUnit {

	@Test
	public void test() {
		//Create new object of calculator class
		calculator obj3=new calculator();
		int output_z=obj3.diff(8,4);
		//Test output
		assertEquals(4,output_z);
	}

}
