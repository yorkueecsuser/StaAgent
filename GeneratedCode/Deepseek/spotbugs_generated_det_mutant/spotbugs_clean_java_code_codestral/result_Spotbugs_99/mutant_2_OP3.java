import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This is the unreachable if branch as per the mutation operator
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }
}