package junit.basic;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * 
 * This rule will apply to all the test methods in a class.
 * 
 * In this example, a global Timeout rule is declared, 
 * both the testSlowMethod1() and testSlowMethod2() must finish the test within 1 second, 
 * else the test will be failed.
 * 
 * NOTE: The rule also applies on @Before and @After methods.
 * NOTE: All unit test should be fast, and this global timeout rule should be your best helper.
 * @author Gaurav Saxena(G89322)
 *
 */
public class Timeout2Test {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    /**
     * This test will be failed, because it will take more than 1 second to finish!
     * @throws InterruptedException
     */
    @Test
    public void testSlowMethod1() throws InterruptedException {
        //...
        TimeUnit.SECONDS.sleep(5000);
    }

    /**
     * This method will pass
     */
    @Test
    public void testSlowMethod2() {
        //...
    }

}
