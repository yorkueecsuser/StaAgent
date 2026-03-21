import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class BugDemoTest {

    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        String initialStr = "initial";
        int number = 123;
        List<String> strings = Arrays.asList("one", "two", "three");

        // The initial value of 'str' should be used before reassignment
        String result = bugDemo.showBug(initialStr, number, strings); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        assertEquals("initial", result); // This assertion will fail due to the bug
    }
}