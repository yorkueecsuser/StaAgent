import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug

        // Inserted mutant: Unreachable for loop
        // The condition of the loop is always false to make it unreachable
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }
    }

    // This method returns false to make the loop condition always false
    private boolean getCondition() {
        return false;
    }
}