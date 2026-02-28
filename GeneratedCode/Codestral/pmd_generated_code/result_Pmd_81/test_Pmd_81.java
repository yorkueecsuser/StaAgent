import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryConversionBugTest {
    @Test
    public void testShowBug() {
        UnnecessaryConversionBug buggyCode = new UnnecessaryConversionBug();
        assertEquals("123", buggyCode.showBug(123)); // TRIGGER BUG: UnnecessaryConversionTemporary
        assertEquals("456", buggyCode.showBug(456)); // TRIGGER BUG: UnnecessaryConversionTemporary
        // More test cases can be added to test other possible failures
    }
}