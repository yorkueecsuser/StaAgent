import org.junit.Test;
import static org.junit.Assert.*;

public class Prone_54Test {

    @Test
    // TRIGGER BUG: FormatString
    public void testFormatString() {
        String expected = "e = +10.4f";
        String actual = Prone_54.showBug();
        assertEquals(expected, actual);
    }
}