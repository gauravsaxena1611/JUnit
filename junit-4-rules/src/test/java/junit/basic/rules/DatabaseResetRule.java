package junit.basic.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Here we have implemented our custom Rule which will clear the database before any test starts.
 * 
 * This rule executes one time before start of every test.
 * 
 * @author Gaurav Saxena(G89322)
 *
 */
public class DatabaseResetRule implements TestRule {

	@Override
	public Statement apply(final Statement base, Description description) {
		
		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {
				// code here executes before test runs
				clearDatabase();
				base.evaluate();
				// code here executes after test is finished
				System.out.println("DB POPULATED");
				
			}
		};
	}

	private void clearDatabase() {
		// write code to clear the database.
		System.out.println("DB Cleaned");
	}
}
