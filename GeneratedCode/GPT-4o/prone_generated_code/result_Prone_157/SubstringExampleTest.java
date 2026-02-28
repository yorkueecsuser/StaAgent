import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringExampleTest {

    @Test
    public void testShowBug() {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original); // TRIGGER BUG: SubstringOfZero
        assertNotNull("The result should not be null", result);
        assertNotSame("The result should not be the same as the original string", original, result); // TRIGGER BUG: SubstringOfZero
    }
}