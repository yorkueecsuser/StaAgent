import org.junit.Test;
import static org.junit.Assert.*;

public class ForLoopBugExampleTest {

    @Test
    public void testShowBug() {
        ForLoopBugExample example = new ForLoopBugExample();
        assertEquals(45, example.showBug(0, 10)); // TRIGGER BUG: A "for" loop update clause should move the counter in the right direction
    }
}