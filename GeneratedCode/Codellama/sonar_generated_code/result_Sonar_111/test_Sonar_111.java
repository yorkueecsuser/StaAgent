import org.junit.Test;
import static org.junit.Assert.*;

class LoopBugTest {
    @Test
    public void testShowBug() {
        LoopBug lb = new LoopBug();
        lb.showBug();
        // TRIGGER BUG: Loop conditions should be true at least once
        System.out.println("This line should not be printed");
    }
}