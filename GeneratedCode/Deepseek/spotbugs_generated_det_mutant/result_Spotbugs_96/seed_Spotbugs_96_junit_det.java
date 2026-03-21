import junit.framework.TestCase;

// BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
class BuggyTest extends TestCase {
    protected void setUp() {
        // This is the bug, super.setUp() is not called
    }

    public void showBug() {
        setUp();
    }
}