package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitConcat obj1 = new jUnitConcat();
		String result = obj1.conc("Software", "Development");
		assertEquals("SoftwareDevelopment", result);
	}
}