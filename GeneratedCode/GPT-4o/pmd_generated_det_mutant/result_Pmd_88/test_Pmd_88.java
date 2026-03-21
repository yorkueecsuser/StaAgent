import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class SynchronizedMethodExampleTest {

    @Test
    public void testShowBug() {
        SynchronizedMethodExample example = new SynchronizedMethodExample();
        List<String> inputData = Arrays.asList("foo", "bar", "foo");
        List<String> result = example.showBug(inputData); // TRIGGER BUG: AvoidSynchronizedAtMethodLevel

        // The test will fail intentionally to demonstrate the bug
        assertEquals(2, result.size()); // This will fail because the synchronization issue causes incorrect processing
    }
}