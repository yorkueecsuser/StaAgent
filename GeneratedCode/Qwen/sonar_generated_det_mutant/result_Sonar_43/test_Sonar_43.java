import org.junit.Test;
import static org.junit.Assert.*;

public class RegexSyntaxErrorExampleTest {

    private RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();

    @Test
    public void testShowBug1() {
        String result = example.showBug1(); // TRIGGER BUG: Regular expressions should be syntactically valid
        assertEquals("Unclosed group", result);
    }

    @Test
    public void testShowBug2() {
        boolean result = example.showBug2(); // TRIGGER BUG: Regular expressions should be syntactically valid
        assertFalse(result);
    }

    @Test
    public void testShowBug3() {
        String result = example.showBug3(); // TRIGGER BUG: Regular expressions should be syntactically valid
        assertEquals("{example", result);
    }

    @Test
    public void testShowBug4() {
        boolean result = example.showBug4(); // TRIGGER BUG: Regular expressions should be syntactically valid
        assertFalse(result);
    }
}