package junit.basic;

public class CustomerService {

	public Customer findByName(String name) throws CustomerCustomException {

		if ("".equals(name)) {
			throw new CustomerCustomException(666, "Name is empty!");
		}

		return new Customer(name);

	}

}
