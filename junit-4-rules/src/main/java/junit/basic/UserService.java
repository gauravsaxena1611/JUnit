package junit.basic;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	private List<User> allUsers = new ArrayList<User>();
	
	public UserService() {
		allUsers.add(new User("Gaurav"));
		allUsers.add(new User("Ramesh"));
		allUsers.add(new User("Ajit"));
		allUsers.add(new User("Suraj"));
		
	}

	public User getUserByName(String name) {
		for (User currentUser : allUsers) {
			if (currentUser.getName().equalsIgnoreCase(name))
				return currentUser;
		}
		return null;
	}

	public List<User> getAllUsers() {
		return allUsers;
	}

}
