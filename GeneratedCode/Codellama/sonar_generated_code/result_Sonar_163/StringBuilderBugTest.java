import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderBugTest {
    @Test
    public void testBug() {
        StringBuilder sb = new StringBuilder('A');
        sb.append(" is the first letter of the alphabet");
        assertEquals("A is the first letter of the alphabet", sb.toString());
    }
}