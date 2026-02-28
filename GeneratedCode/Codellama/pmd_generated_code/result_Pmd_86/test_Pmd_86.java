import org.junit.Test;
import static org.junit.Assert.*;

public class CaseConversionBugTest {
    @Test
    public void testToLowerCaseWithDefaultLocale() {
        String str = "İ";
        assertEquals("i", str.toLowerCase()); // TRIGGER BUG: UseLocaleWithCaseConversions
    }

    @Test
    public void testToUpperCaseWithDefaultLocale() {
        String str = "i";
        assertEquals("İ", str.toUpperCase()); // TRIGGER BUG: UseLocaleWithCaseConversions
    }
}