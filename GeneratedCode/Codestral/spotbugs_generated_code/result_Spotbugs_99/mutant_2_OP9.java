import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug

        // Add a do-while loop simulating a loop structure without any impact on the existing functionality
        int i = 0;
        do {
            i++;
        } while (i < 0);  // This will execute the loop body once only, as i is initialized to 0 and the loop condition is false
    }
}