import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringOfZeroBugTest {
    @Test
    public void testShowBug() {
        SubstringOfZeroBug buggyClass = new SubstringOfZeroBug();
        String input = "TestString";
        String result = buggyClass.showBug(input);
        // TRIGGER BUG: SubstringOfZero
        assertNotEquals(input, result);
    }
}