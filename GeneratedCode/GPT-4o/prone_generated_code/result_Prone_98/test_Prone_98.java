import org.junit.Test;
import static org.junit.Assert.*;

public class LenientFormatStringExampleTest {

    @Test
    public void testShowBug() {
        LenientFormatStringExample.showBug(); // TRIGGER BUG: LenientFormatStringValidation
    }
}