import org.junit.Test;
import static org.junit.Assert.*;

public class InlineMeExampleTest {
    @Test
    public void testShowBug() {
        InlineMeExample example = new InlineMeExample();
        example.showBug();
        // TRIGGER BUG: InlineMeValidator

        assertEquals("This is a valid inline comment", example.showBug());
    }

    @Test
    public void testShowBug1() {
        InlineMeExample example = new InlineMeExample();
        example.showBug1();
        // TRIGGER BUG: InlineMeValidator

        assertEquals("", example.showBug1());
    }

    @Test
    public void testShowBug2() {
        InlineMeExample example = new InlineMeExample();
        example.showBug2();
        // TRIGGER BUG: InlineMeValidator

        assertEquals("", example.showBug2());
    }
}