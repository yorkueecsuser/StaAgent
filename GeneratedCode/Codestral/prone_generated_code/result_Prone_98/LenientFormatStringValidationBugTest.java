import org.junit.Test;
import static org.junit.Assert.*;
import java.util.IllegalFormatException;

public class LenientFormatStringValidationBugTest {
    @Test(expected = IllegalFormatException.class)
    public void testExtraArgumentBug() { // TRIGGER BUG: LenientFormatStringValidation
        LenientFormatStringValidationBug buggyClass = new LenientFormatStringValidationBug();
        buggyClass.showBug("John");
    }
}