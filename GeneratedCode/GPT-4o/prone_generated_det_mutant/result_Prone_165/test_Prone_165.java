import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ThrowableCatchExampleTest {

    @Test
    public void testShowBug() {
        ThrowableCatchExample example = new ThrowableCatchExample();
        List<String> result = example.showBug();
        
        // This line is expected to fail because the method showBug should throw an exception
        // and catch Throwable, which includes AssertionError thrown by fail().
        // Therefore, this assertion will not be executed and the test should fail.
        fail("Exception was not caught as expected"); // TRIGGER BUG: TryFailThrowable

        // Additional assertions can be added here if needed
        // assertEquals("Expected exception caught", result.get(0));
    }
}