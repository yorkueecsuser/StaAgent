import org.junit.Test;
import static org.junit.Assert.*;

public class JumbledIncrementerTest {
    @Test
    public void testShowBug() {
        JumbledIncrementer jumbledIncrementer = new JumbledIncrementer();
        // TRIGGER BUG: JumbledIncrementer
        jumbledIncrementer.showBug();
        assertTrue("The inner loop should have incremented 'k' instead of 'i'", jumbledIncrementer.i == 10);
    }
}