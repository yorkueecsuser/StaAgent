import junit.framework.TestCase;

class ExampleJUnitBug extends TestCase {

    // This method is intended to be a test but does not start with "test"
    public void shoudBeATest() {
        assertEquals(2, 1 + 1); // BUG: JUnit3TestNotRun
    }

    // This method is intended to be a test but is static
    public static void testStaticMethod() {
        assertEquals(2, 1 + 1); // BUG: JUnit3TestNotRun
    }

    // This method is intended to be a test but is private
    private void testPrivateMethod() {
        assertEquals(2, 1 + 1); // BUG: JUnit3TestNotRun
    }

    // Method to demonstrate the bug
    public String showBug() {
        return "Check the console for JUnit results. Methods should not run.";
    }
}