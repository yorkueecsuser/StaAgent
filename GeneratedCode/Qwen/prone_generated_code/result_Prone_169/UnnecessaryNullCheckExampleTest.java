import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryNullCheckExampleTest {

    @Test
    public void testShowBugWithNonNullInput() {
        UnnecessaryNullCheckExample example = new UnnecessaryNullCheckExample();
        assertEquals("Input is not null: Hello", example.showBug("Hello")); // TRIGGER BUG: UnnecessaryCheckNotNull
    }

    @Test
    public void testShowBugWithNullInput() {
        UnnecessaryNullCheckExample example = new UnnecessaryNullCheckExample();
        assertEquals("Input is null", example.showBug(null)); // TRIGGER BUG: UnnecessaryCheckNotNull
    }
}