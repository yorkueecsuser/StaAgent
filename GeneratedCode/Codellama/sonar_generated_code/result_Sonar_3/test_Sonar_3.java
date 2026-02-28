import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOfBugTest {
    @Test
    public void testStringIndexOfBug() {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        assertEquals(6, index);
    }
}