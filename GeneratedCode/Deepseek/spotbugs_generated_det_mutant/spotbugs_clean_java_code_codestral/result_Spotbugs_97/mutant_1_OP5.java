import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        // Original bug: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        boolean isFalse = getFalseCondition();
        switch (isFalse? 1 : 0) {
            case 1:
                // Unreachable code
                super.tearDown();
                break;
        }
        value = 0;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void testMethod() {
        assertEquals(5, value);
    }

    public int showBug() {
        setUp();
        tearDown();
        return value;
    }
}