import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug

        // Mutated code: Unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This code should never run");
        } else {
            // Alternative code
            System.out.println("This code always runs");
        }
    }
}