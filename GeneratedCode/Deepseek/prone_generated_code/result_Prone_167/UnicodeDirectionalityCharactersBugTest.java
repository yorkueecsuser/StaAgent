import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeDirectionalityCharactersBugTest {

    UnicodeDirectionalityCharactersBug bug = new UnicodeDirectionalityCharactersBug();

    @Test // TRIGGER BUG: UnicodeDirectionalityCharacters
    public void testShowBug() {
        // Line 8 in the original code'reversed += input.charAt(i);' is buggy
        String result = bug.showBug("abc");
        assertNotEquals("cba", result); // Expecting the result to be different from the expected output
    }
}