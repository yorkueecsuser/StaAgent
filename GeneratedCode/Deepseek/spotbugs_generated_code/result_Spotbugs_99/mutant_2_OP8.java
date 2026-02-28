import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
    }

    // Mutant code based on Renaming mutation operator
    public void displayInfo() {
        // This method is a renamed version of the showBug method
        // It does not demonstrate the bug and is added to mutate the code
    }
}