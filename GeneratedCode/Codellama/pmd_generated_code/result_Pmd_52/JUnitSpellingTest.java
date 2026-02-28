import org.junit.Test;
import static org.junit.Assert.*;

class JUnitSpellingTest {
    @Test
    public void testBug() {
        JUnitSpelling test = new JUnitSpelling();
        test.showBug();
        // TRIGGER BUG: JUnitSpelling
    }
}