import org.junit.Test;
import static org.junit.Assert.*;

public class SignedByteComparisonTest {

    @Test
    public void testCompareSignedByte() {
        SignedByteComparison example = new SignedByteComparison();
        byte b = 100;
        int value = 200;

        // This test is supposed to fail due to the bug in SignedByteComparison class
        boolean result = example.showBug(b, value); // TRIGGER BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        assertFalse(result); // Expecting false, but due to bug might be true
    }

    @Test
    public void testCompareSignedByteNegative() {
        SignedByteComparison example = new SignedByteComparison();
        byte b = -120;
        int value = -200;

        // This test is supposed to fail due to the bug in SignedByteComparison class
        boolean result = example.showBug(b, value); // TRIGGER BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        assertFalse(result); // Expecting false, but due to bug might be true
    }
}