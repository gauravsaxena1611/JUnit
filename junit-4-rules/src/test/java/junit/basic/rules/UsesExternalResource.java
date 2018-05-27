package junit.basic.rules;

import org.junit.rules.ExternalResource;

/**
 * ExternalResource rule guarantees the method execution before and after every
 * Test
 * 
 * @author Gaurav Saxena(G89322)
 *
 */
public class UsesExternalResource extends ExternalResource {
	
	//Consider we have created a server here
	// Server myServer= new Server();

	protected void before() throws Throwable {
		// myServer.connect();
		System.out.println("Server Successsfully Connected.");
	}

	protected void after() {
		// myServer.disconnect();
		System.out.println("Server Successsfully Dis-Connected.");
		System.out.println("\n");
	}

}
