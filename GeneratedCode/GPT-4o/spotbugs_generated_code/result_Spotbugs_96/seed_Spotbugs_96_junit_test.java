import junit.framework.TestCase;

class ExampleTestCase extends TestCase {

    private int counter;

    @Override
    protected void setUp() {
        counter = 0; // The superclass's setUp() method is not called
    } // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)

    public void testIncrementCounter() {
        counter++;
        assertEquals(1, counter);
    }

    public void showBug() {
        try {
            this.setUp();
            System.out.println("After setUp, counter is: " + counter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}