import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderInitWithCharBugTest {
    @Test
    public void testBug() {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        assertEquals("ahello", sb.toString());
    }
}