import org.junit.Test;
import static org.junit.Assert.*;

public class AppendCharacterWithCharBugTest {

    @Test
    public void testShowBug() {
        AppendCharacterWithCharBug bugExample = new AppendCharacterWithCharBug();
        String result = bugExample.showBug(); // TRIGGER BUG: AppendCharacterWithChar
        assertEquals("a", result);
    }
}