import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousOctalEscapeExampleTest {

    @Test
    public void testShowBug() {
        SuspiciousOctalEscapeExample example = new SuspiciousOctalEscapeExample();
        String result = example.showBug(); // TRIGGER BUG: SuspiciousOctalEscape
        assertEquals("suspicious: \128", result); // TRIGGER BUG: SuspiciousOctalEscape
    }
}