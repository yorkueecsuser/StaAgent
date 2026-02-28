import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop as per the mutation operator
            System.out.println("This line is unreachable");
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}