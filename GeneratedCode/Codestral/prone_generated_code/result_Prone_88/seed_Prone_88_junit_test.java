import junit.framework.TestCase;

class JUnit3TestNotRunBug extends TestCase {

    // Bug: Method name should start with "test" to be recognized by JUnit 3
    public void incorrectTestMethod() { // BUG: JUnit3TestNotRun
        fail("This test will not run as it does not start with 'test'.");
    }

    public void showBug() {
        // Calling the buggy method will result in a failure as JUnit 3 will not recognize it
        try {
            incorrectTestMethod();
        } catch (AssertionError e) {
            System.out.println("The buggy test method was not run by JUnit 3.");
        }
    }

    public static void main(String[] args) {
        JUnit3TestNotRunBug bugDemo = new JUnit3TestNotRunBug();
        bugDemo.showBug();
    }
}