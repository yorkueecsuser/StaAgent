import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedThreadExampleTest {

    @Test
    public void testShowBug() {
        InterruptedThreadExample example = new InterruptedThreadExample();
        String result = example.showBug(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        assertEquals("Bug demonstrated with InterruptedException", result);
    }

    @Test
    public void testShowBug1() {
        InterruptedThreadExample example = new InterruptedThreadExample();
        String result = example.showBug1(); // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
        assertEquals("Bug demonstrated with ThreadDeath", result);
    }
}