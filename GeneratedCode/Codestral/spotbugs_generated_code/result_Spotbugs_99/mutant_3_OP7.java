import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable.
            System.out.println("This line should never be executed.");
        }
    }
}