import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleSuiteTest {

    @Test
    public void testShowBug() {
        ExampleSuite exampleSuite = new ExampleSuite("testCase");
        assertEquals("This method is just to demonstrate the presence of the bug.", exampleSuite.showBug());
        exampleSuite.suite(); // TRIGGER BUG: IJU: TestCase declares a bad suite method (IJU_BAD_SUITE_METHOD) 
    }
}