import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeDirectionalityExampleTest {

    @Test
    public void testShowBug() {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        assertEquals("Visible part of the string; System.out.println(\"This is hidden code!\");", result); // TRIGGER BUG: UnicodeDirectionalityCharacters
    }
}