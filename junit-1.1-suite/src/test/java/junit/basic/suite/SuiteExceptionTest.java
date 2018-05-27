package junit.basic.suite;

import junit.basic.Exception1Test;
import junit.basic.Exception2Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Exception1Test.class, Exception2Test.class })
public class SuiteExceptionTest {

}
