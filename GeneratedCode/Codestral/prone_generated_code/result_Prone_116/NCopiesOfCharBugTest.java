import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class NCopiesOfCharBugTest {
    @Test
    public void testNCopiesOfCharBug() {
        List<String> buggyList = NCopiesOfCharBug.showBug();
        for (String s : buggyList) {
            assertEquals("a", s);  // TRIGGER BUG: NCopiesOfChar
        }
    }
}