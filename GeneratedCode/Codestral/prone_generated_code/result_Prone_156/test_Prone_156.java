import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderInitWithCharBugTest {

    @Test
    public void testBug() {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a'); // TRIGGER BUG: StringBuilderInitWithChar
        assertEquals("StringBuilder length should be 1, not 97", 1, sb.length());
    }
}