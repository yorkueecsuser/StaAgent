import org.junit.Test;

class JUnit4SetUpNotRunBug {
    private String testString;

    // This method will not be run by JUnit4, as it is missing the @Before annotation
    public void setUp() {
        testString = "TestString"; // BUG: JUnit4SetUpNotRun
    }

    @Test
    public void testMethod() {
        System.out.println("Test String: " + testString); // testString is null as setUp() was not run
    }

    // Method to demonstrate the bug
    public String showBug() {
        testMethod();
        return testString;
    }
}