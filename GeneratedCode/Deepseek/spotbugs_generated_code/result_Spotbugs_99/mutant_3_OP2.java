import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
    }

    // Mutant code - Duplication of the showBug method
    public void showBugMutant() {
        // This method is a mutant that duplicates the showBug method
        // It is present to demonstrate the mutation operator
        // This method does not fix the original bug
    }
}