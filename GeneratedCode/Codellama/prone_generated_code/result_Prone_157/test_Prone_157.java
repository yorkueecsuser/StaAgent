import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyStringTest {
    @Test
    public void testBug() {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // TRIGGER BUG: SubstringOfZero
        assertEquals(substr, "Hello, World!");
    }
}