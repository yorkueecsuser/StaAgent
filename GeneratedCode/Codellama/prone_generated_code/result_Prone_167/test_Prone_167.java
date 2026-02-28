import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeDirectionalityBugTest {
    @Test
    public void testBug() {
        // TRIGGER BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\u200e' || c == '\u200f') {
                output += c;
            }
        }
        assertEquals("Hello World!", output);
    }
}