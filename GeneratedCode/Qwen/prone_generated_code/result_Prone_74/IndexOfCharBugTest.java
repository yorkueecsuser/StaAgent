import org.junit.Test;
import static org.junit.Assert.*;

public class IndexOfCharBugTest {

    @Test
    public void testIndexOfWithCodePoint() {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        // TRIGGER BUG: IndexOfChar
        assertEquals(4, bugDemo.showBug("Hello, World!", 0x004F, 0)); // Searching for 'O'
    }

    @Test
    public void testIndexOfWithInvalidCodePoint() {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        // TRIGGER BUG: IndexOfChar
        assertEquals(-1, bugDemo.showBug("Hello, World!", 0x1F600, 0)); // Searching for a non-BMP character
    }
}