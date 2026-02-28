import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class ResourceHandler {

    private String resource;

    @Before
    public void setUp() {
        resource = "Initialized";
    }

    @Test
    public void testResourceUsage() {
        assertEquals("Initialized", resource);
        resource = "Used";
    }

    // BUG: JUnit4TearDownNotRun
    public void tearDown() { // This method should have @After annotation to run automatically after each test
        resource = null;
    }

    public String showBug() {
        // Simulate the test running process
        setUp();
        testResourceUsage();
        tearDown();
        return resource;
    }
}