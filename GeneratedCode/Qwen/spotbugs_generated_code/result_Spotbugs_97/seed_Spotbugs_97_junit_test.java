import junit.framework.TestCase;

class ExampleBug extends TestCase {

    private int counter;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        counter = 0;
    }

    @Override
    protected void tearDown() throws Exception {
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
    }

    public int showBug() {
        counter++;
        return counter;
    }
}