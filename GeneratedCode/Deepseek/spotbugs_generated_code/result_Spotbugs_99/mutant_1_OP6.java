import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This for loop will never execute because conditionFor is always false
        }
    }

    public boolean getCondition() {
        // This method returns false to make the for loop in showBug() unreachable
        return false;
    }
}