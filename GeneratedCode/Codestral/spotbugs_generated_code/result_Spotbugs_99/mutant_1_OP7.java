import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop inserted as per Mutation Operator: Unreachable while loop
            // The condition of the loop is always false to make it unreachable
            // This line is never executed, maintaining the original bug
        }
    }

    private boolean getCondition() {
        // This method always returns false to keep the while loop unreachable
        return false;
    }
}