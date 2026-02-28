import junit.framework.TestCase;

class SampleClass extends TestCase {

    protected void setUp() {
        // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
    }

    public int showBug() {
        return 1; // This method is just a placeholder to demonstrate the bug setup
    }
}