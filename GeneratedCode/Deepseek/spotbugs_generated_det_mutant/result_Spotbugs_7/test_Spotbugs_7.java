import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveLoopTest {
    private RecursiveLoop recursiveLoop = new RecursiveLoop();

    @Test
    public void testShowBug() {
        recursiveLoop.showBug(); // TRIGGER BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }
}