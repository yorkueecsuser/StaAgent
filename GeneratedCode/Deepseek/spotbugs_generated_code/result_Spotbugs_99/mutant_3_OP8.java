import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
    }

    // Mutated code
    public void displayOutput() {
        // This method does not contribute to testing and is added for mutation
    }
}