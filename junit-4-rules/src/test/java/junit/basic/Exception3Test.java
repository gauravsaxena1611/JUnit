package junit.basic;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This ExpectedException rule (since JUnit 4.7) let you test both the exception type and also the exception detail, 
 * @author Gaurav Saxena(G89322)
 *
 */
@SuppressWarnings("unused")
public class Exception3Test {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testDivisionWithException() {

		thrown.expect(ArithmeticException.class);
		thrown.expectMessage(containsString("/ by zero"));

		
		int i = 1 / 0;

	}

	@Test
	public void testNameNotFoundException() throws CustomerCustomException  {

		// test type
		thrown.expect(CustomerCustomException.class);

		// test message
		thrown.expectMessage(is("Name is empty!"));

		// test detail
		thrown.expect(hasProperty("errCode")); // make sure getters n setters are defined.
		
		thrown.expect(hasProperty("errCode", is(666)));

		CustomerService cust = new CustomerService();
		cust.findByName("");

	}

}
