import org.junit.Test;
import static org.junit.Assert.*;

public class IndexOfExampleTest {

    @Test
    public void testShowBugWithSingleCharacter() {
        IndexOfExample example = new IndexOfExample();
        int result = example.showBug("hello world"); // TRIGGER BUG: UseIndexOfChar
        assertEquals(-1, result); // This will fail because the method uses indexOf(String) instead of indexOf(char)
    }

    @Test
    public void testShowBugWithCharacterPresent() {
        IndexOfExample example = new IndexOfExample();
        int result = example.showBug("world"); // TRIGGER BUG: UseIndexOfChar
        assertEquals(1, result); // This will fail because the method uses indexOf(String) instead of indexOf(char)
    }
}