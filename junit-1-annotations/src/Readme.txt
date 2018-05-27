Basic annotations
----------------

1. @BeforeClass - Run once before any OR all the test methods in the class, public static void.
2. @AfterClass - Run once after any OR all the tests in the class have been run, public static void.

3. @Before - Run before every single @Test, public void.
4. @After - Run after every single @Test, public void.

5. @Test - This is the test method to run, public void.

6. @Ignore - To ignore a test.

7. @FixMethodOrder(MethodSorters.NAME_ASCENDING) - To run the test methods by method name, in lexicographic order

8, @Test(timeout = 1000) 

9, How to run JUnit tests via command line

10, Expected Exceptions - In JUnit, there are 3 ways to test the expected exceptions :
			
A) @Test(expected = Exception.class) -  optional "expected" attribute

B) Try-catch and always fail() - 
This is a bit old school, widely used in JUnit 3. Test the exception type and also the exception detail. 
If the line you want to test didn�t throw any exception, and you forgot to put the fail(), the test will be passed (false positive).

C) @Rule ExpectedException


