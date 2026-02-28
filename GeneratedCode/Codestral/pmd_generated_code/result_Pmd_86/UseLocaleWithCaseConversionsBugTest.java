import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;

public class UseLocaleWithCaseConversionsBugTest {

    @Test
    public void testShowBug() {
        Locale.setDefault(new Locale("tr", "TR")); // Set Turkish locale
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        assertEquals("Not matched", UseLocaleWithCaseConversionsBug.showBug(input)); // TRIGGER BUG: UseLocaleWithCaseConversions
    }
}