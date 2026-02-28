import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug

        // Mutated code: Unreachable if statement
        if (getUnreachableCondition()) {
            // This code will never execute
            System.out.println("This is an unreachable if statement");
        }
    }

    // This method always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}