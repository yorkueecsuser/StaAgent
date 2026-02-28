import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerExampleTest {

    @Test
    public void testShowBug() {
        LoggerExample example = new LoggerExample();
        String result = example.showBug("Part1", "Part2"); // TRIGGER BUG: FloggerSplitLogStatement
        assertEquals("Logged parts: Part1 | Part2", result); // TRIGGER BUG: FloggerSplitLogStatement
    }

}