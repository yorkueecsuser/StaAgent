import org.junit.Test;
import static org.junit.Assert.*;

public class OctalEscapeExampleTest {

    @Test
    public void testShowBug() {
        OctalEscapeExample example = new OctalEscapeExample();
        assertEquals("suspicious: \128", example.showBug()); // TRIGGER BUG: SuspiciousOctalEscape
    }
}