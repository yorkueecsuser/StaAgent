import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

@RunWith(JUnit4.class)
class ExampleClass {

    private int counter = 0;

    // This setUp method is intended to initialize the counter, but it is not annotated with @Before
    void setUp() { // BUG: JUnit4SetUpNotRun
        counter = 10;
    }

    @Test
    public void exampleTest() {
        // This test should fail because setUp() is not called, so counter remains 0
        assert counter == 10 : "Counter should be initialized to 10";
    }

    public int showBug() {
        // This method demonstrates the bug by returning the counter value without calling setUp()
        return counter;
    }
}