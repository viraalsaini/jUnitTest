package jUnitTestPackage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions obj1 = new jUnitFunctions();
		int result = obj1.add(10, 20);
		assertEquals(30, result);
	}
}
