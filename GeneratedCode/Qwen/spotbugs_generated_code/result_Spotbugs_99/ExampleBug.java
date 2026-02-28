import junit.framework.TestCase;

class ExampleBug extends TestCase {

    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS) 

    public void showBug() {
        // This method is intended to demonstrate the bug, but since there are no test methods, it does nothing.
        return;
    }
}