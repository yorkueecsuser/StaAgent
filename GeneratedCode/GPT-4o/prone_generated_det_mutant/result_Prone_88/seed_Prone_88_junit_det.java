import junit.framework.TestCase;

class ExampleJUnit3 extends TestCase {

    // This method is supposed to be a test but misses the 'test' prefix
    public void shouldRunAsTest() {
        System.out.println("This test should run but won't be detected by JUnit 3.");
    } // BUG: JUnit3TestNotRun

    // This method is supposed to be a test but is static
    public static void testMethodIsStatic() {
        System.out.println("This static method will not be recognized as a test by JUnit 3.");
    } // BUG: JUnit3TestNotRun

    // This method is correct and will be recognized by JUnit 3
    public void testValidMethod() {
        System.out.println("This test will run correctly under JUnit 3.");
    }

    // Demonstration method for the buggy code
    public void showBug() {
        shouldRunAsTest();
        testMethodIsStatic();
    }
}