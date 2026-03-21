import org.junit.Test;
import static org.junit.Assert.*;

public class ForLoopBugExampleTest {

    @Test
    public void testShowBugWithBugTrigger() {
        ForLoopBugExample example = new ForLoopBugExample();
        int result = example.showBug(1, 10); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
        assertEquals(45, result); // This assertion will fail, triggering the bug
    }
}