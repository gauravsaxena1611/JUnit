package junit.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class Exception2Test {

	@Test
	public void testDivisionWithException() {
		try {
			int i = 1 / 0;
			fail(); // remember this line, else 'may' false positive
		} catch (ArithmeticException e) {
			assertThat(e.getMessage(), is("/ by zero"));
			// assert others
		}
	}

	@Test
	public void testEmptyList() {
		try {
			new ArrayList<>().get(0);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
	}

}
