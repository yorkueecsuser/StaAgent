import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ExampleBug {

    private int counter;

    @Before
    public void setUp() {
        counter = 10;
        System.out.println("Setup: Counter initialized to " + counter);
    }

    public void tearDown() { // BUG: JUnit4TearDownNotRun
        counter = 0;
        System.out.println("TearDown: Counter reset to " + counter);
    }

    public void performTest() {
        counter--;
        System.out.println("Test: Counter decremented to " + counter);
    }

    public int showBug() {
        performTest();
        return counter; // Expected to be 9, but tearDown is not called
    }
}