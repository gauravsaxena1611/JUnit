package junit.basic;

public class User {

	private String name;

	public User(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equalsIgnoreCase(((User)obj).getName());
	}

}
