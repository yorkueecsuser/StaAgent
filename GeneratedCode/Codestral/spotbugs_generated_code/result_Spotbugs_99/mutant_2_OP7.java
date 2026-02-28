import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug

        // Mutant Code: Adding an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This code block is unreachable as the condition always returns false
            System.out.println("This is an unreachable while loop.");
        }
    }

    // Method to return false condition
    private boolean getFalseCondition() {
        return false;
    }
}