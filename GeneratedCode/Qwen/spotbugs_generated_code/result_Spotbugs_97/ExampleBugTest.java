import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleBugTest {

    @Test
    public void testShowBug() {
        ExampleBug exampleBug = new ExampleBug();
        assertEquals(1, exampleBug.showBug()); // TRIGGER BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        assertEquals(2, exampleBug.showBug());
    }
}