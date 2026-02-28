import org.junit.Test;
import static org.junit.Assert.*;

public class SignedByteComparisonBugTest {

    @Test
    public void testShowBug() {
        SignedByteComparisonBug bugDemonstrator = new SignedByteComparisonBug();
        byte value = (byte) 128; // This is outside the range of a signed byte
        byte result = bugDemonstrator.showBug(value); // TRIGGER BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)

        // Since 128 is outside the range of a signed byte, the if condition in the showBug method should not execute.
        // Therefore, the result should be equal to the input value.
        assertEquals(value, result);
    }
}