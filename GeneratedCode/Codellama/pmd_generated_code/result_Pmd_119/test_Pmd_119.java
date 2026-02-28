import org.junit.Test;
import static org.junit.Assert.*;

public class UseIndexOfCharTest {
    @Test
    public void testBug() {
        String str = "Hello, World!";
        int index = str.indexOf("o");
        assertEquals(4, index);
        // TRIGGER BUG: UseIndexOfChar
    }
}