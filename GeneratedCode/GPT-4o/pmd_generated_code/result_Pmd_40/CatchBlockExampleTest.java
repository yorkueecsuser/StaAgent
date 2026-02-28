import org.junit.Test;
import static org.junit.Assert.*;

public class CatchBlockExampleTest {

    @Test
    public void testShowBugWithIncorrectFilePath() {
        CatchBlockExample example = new CatchBlockExample();
        String result = example.showBug("/invalid/path/to/file"); // TRIGGER BUG: EmptyCatchBlock
        assertNotEquals("Finished without handling exception.", result); // TRIGGER BUG: EmptyCatchBlock
    }

    @Test
    public void testShowBugWithCorrectFilePath() {
        CatchBlockExample example = new CatchBlockExample();
        String result = example.showBug("/tmp/bugger"); // Assumes file exists for this test
        assertEquals("Finished without handling exception.", result); // TRIGGER BUG: EmptyCatchBlock
    }
}