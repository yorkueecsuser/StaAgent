import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class ExampleTestCase extends TestCase {

    public ExampleTestCase(String testName) {
        super(testName);
    }

    public static Test testMethod1() {
        // A simple test method
        return new ExampleTestCase("testMethod1");
    }

    public static Test testMethod2() {
        // Another simple test method
        return new ExampleTestCase("testMethod2");
    }

    public Test suite() { // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
        TestSuite suite = new TestSuite();
        suite.addTest(testMethod1());
        suite.addTest(testMethod2());
        return suite;
    }

    public void showBug() {
        // Attempt to execute the suite method, demonstrating the bug
        Test suite = suite(); // This will run successfully but it's not the recommended practice as per JUnit standards
        System.out.println("Test suite created: " + suite);
    }

    public static void main(String[] args) {
        ExampleTestCase testCase = new ExampleTestCase("Main Test");
        testCase.showBug();
    }
}