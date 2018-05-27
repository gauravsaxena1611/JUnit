package junit.basic;
import org.junit.Test;

/**
 * This timeout example only applies to a single test method. And the timeout value is in milliseconds.
 * This timeout test is useful to test on the method performance.
 * 
 * @author Gaurav Saxena(G89322)
 *
 */
public class Timeout1Test {

    /**
     * This test will always failed :)
     */
    @Test(timeout = 1000)
    public void infinity() {
        while (true) ;
    }

    /**
     * This test can't run more than 5 seconds, else failed
     */
    @Test(timeout = 5000)
    public void testSlowMethod() {
        //...
    }

}
