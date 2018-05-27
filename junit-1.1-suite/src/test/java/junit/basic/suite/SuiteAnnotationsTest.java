package junit.basic.suite;

import junit.basic.BasicAnnotationTest;
import junit.basic.ClassPropertyTest;
import junit.basic.IgnoreTest;
import junit.basic.TimeoutTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BasicAnnotationTest.class, ClassPropertyTest.class, IgnoreTest.class, TimeoutTest.class })
public class SuiteAnnotationsTest {

	//normally this is an empty class
}
