package junit.basic.suite;

import junit.basic.ExecutionOrderTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * We can run multiple test cases with @RunWith and @Suite annotation.
 * 
 * @author Gaurav Saxena(G89322)
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SuiteAnnotationsTest.class, 
	SuiteExceptionTest.class,
	ExecutionOrderTest.class
})
public class SuiteAllTest {
	//normally, this is an empty class
}
