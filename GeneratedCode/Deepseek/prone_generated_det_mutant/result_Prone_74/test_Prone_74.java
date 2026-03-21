import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        String str = "Hello, World!";
        int index = str.indexOf(65);  // TRIGGER BUG: IndexOfChar
        assertEquals(-1, index);
    }
}