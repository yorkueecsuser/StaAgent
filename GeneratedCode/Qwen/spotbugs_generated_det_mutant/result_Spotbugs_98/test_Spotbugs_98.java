import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestSuite; // Added import for TestSuite

public class ExampleSuiteTest {

    @Test
    public void testShowBug() {
        ExampleSuite exampleSuite = new ExampleSuite();
        String result = exampleSuite.showBug(); // TRIGGER BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
        assertEquals("This method demonstrates the bug by calling the non-static suite method.", result);
    }

    @Test
    public void testNonStaticSuiteMethod() {
        ExampleSuite exampleSuite = new ExampleSuite();
        TestSuite suite = exampleSuite.suite(); // TRIGGER BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
        assertNotNull(suite);
    }
}