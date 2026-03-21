import org.junit.*;

class TearDownNotRunTest {

    @Before
    public void setUp() {
        System.out.println("Setting up the test");
    }

    @Test
    public void testMethod() {
        System.out.println("Running the test");
    }

    public void tearDown() {  // BUG: JUnit4TearDownNotRun
        System.out.println("Tearing down the test. This line will not be executed.");
    }

    public void showBug() {
        // This method won't demonstrate the bug directly as it's a runtime issue.
        // However, it's used to trigger the test and show that the tearDown() method is not executed.
    }
}