import junit.framework.TestCase;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
        int value = getValue();
        switch (value) {
            case 1:
                // This case is unreachable as value is never 1
                System.out.println("This is unreachable code");
                break;
            default:
                break;
        }
    }

    private int getValue() {
        // This method always return 2 to make the switch statement unreachable
        return 2;
    }
}