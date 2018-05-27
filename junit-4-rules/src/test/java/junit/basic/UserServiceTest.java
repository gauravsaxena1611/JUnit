package junit.basic;

import junit.basic.rules.DatabaseResetRule;
import junit.basic.rules.UsesExternalResource;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {
	
	@Rule
	public DatabaseResetRule databaseResetRule = new DatabaseResetRule();
	@Rule
	public UsesExternalResource externalResource = new UsesExternalResource();

	@Test
	public void shouldAddUserToDatabase() {
		
		System.out.println("Method : shouldAddUserToDatabase Called.");
		UserService service = new UserService();
		assertNotNull(service.getUserByName("Ajit"));
	}

	@Test
	public void shouldGetAllUsers() {
		System.out.println("Method : shouldGetAllUsers Called.");
		UserService service = new UserService();
		assertThat(service.getAllUsers().size(), is(4));
	}
}
