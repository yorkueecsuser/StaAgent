import org.junit.Test;
import static org.junit.Assert.*;

public class NCopiesOfCharTest {
    @Test
    public void testBugNCopiesOfChar() {
        List<Character> list = NCopiesOfChar.nCopies('a', 10);
        assertEquals(10, list.size());
        for (Character c : list) {
            assertEquals('a', c);
        }
    }
}