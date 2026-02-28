import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringExampleTest {

    @Test
    public void testSubstringOfZero() {
        SubstringExample example = new SubstringExample();
        String result = example.showBug("HelloWorld"); // TRIGGER BUG: SubstringOfZero
        assertEquals("Expected substring to be different", "HelloWorld", result);
    }
}