import org.junit.Test;
import static org.junit.Assert.*;

public class LocaleBugExampleTest {

    @Test
    public void testShowBugWithTurkishLocale() {
        LocaleBugExample example = new LocaleBugExample();
        assertEquals("list", example.showBug("LIST")); // TRIGGER BUG: UseLocaleWithCaseConversions
    }

    @Test
    public void testShowBugWithGermanLocale() {
        LocaleBugExample example = new LocaleBugExample();
        assertEquals("straße", example.showBug("STRASSE")); // TRIGGER BUG: UseLocaleWithCaseConversions
    }
}