import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderBugExampleTest {

    @Test
    public void testShowBug() {
        StringBuilderBugExample example = new StringBuilderBugExample();
        String result = example.showBug('A'); // TRIGGER BUG: StringBuilderInitWithChar
        assertEquals("AHello", result); // This assertion will fail because the actual result is "Hello" with capacity 65
    }
}