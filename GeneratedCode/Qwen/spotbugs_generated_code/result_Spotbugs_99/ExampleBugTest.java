import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleBugTest {

    @Test
    public void testShowBug() {
        ExampleBug exampleBug = new ExampleBug();
        exampleBug.showBug(); // TRIGGER BUG: IJU: TestCase has no tests (IJU_NO_TESTS) 
        fail("This test is expected to fail because the ExampleBug class has no test methods."); // Ensure the test fails
    }
}