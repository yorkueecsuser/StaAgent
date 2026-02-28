import org.junit.Test;
import static org.junit.Assert.*;

public class SpelSyntaxErrorDemoTest {

    @Test
    public void testShowBugTriggersSpelSyntaxError() {
        SpelSyntaxErrorDemo demo = new SpelSyntaxErrorDemo();
        String result = (String) demo.showBug(); // TRIGGER BUG: SpEL expression should have a valid syntax
        assertEquals("#{name + '!'", result); // This assertion will pass, but the bug is in the expression itself
    }
}