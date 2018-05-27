package junit.basic;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Forget about JUnit assertEquals(), to test a Map, uses the more expressive IsMapContaining class from 
 * hamcrest-library.jar
 * 
 * @author Gaurav Saxena(G89322)
 *
 */
public class MapTest {

	@Test
	public void testAssertMap() {

		Map<String, String> map = new HashMap<>();
		map.put("j", "java");
		map.put("c", "c++");
		map.put("p", "python");
		map.put("n", "node");

		Map<String, String> expected = new HashMap<>();
		expected.put("n", "node");
		expected.put("c", "c++");
		expected.put("j", "java");
		expected.put("p", "python");

		// All passed / true

		// 1. Test equal, ignore order
		assertThat(map, is(expected));

		// 2. Test size
		assertThat(map.size(), is(4));

		// 3. Test map entry, best!
		assertThat(map, IsMapContaining.hasEntry("n", "node"));

		assertThat(map, not(IsMapContaining.hasEntry("r", "ruby")));

		// 4. Test map key
		assertThat(map, IsMapContaining.hasKey("j"));

		// 5. Test map value
		assertThat(map, IsMapContaining.hasValue("node"));

	}

}
