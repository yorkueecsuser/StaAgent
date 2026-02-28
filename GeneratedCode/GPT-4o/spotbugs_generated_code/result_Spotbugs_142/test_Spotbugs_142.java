import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleTypeQualifierComparisonTest {

    @Test
    public void testCompareValues() {
        IncompatibleTypeQualifierComparison itqc = new IncompatibleTypeQualifierComparison(-1, 1);
        boolean result = itqc.showBug(-1, 1); // TRIGGER BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        assertFalse(result); // Test should fail since -1 and 1 are not equal
    }

    @Test
    public void testCompareValuesWithZero() {
        IncompatibleTypeQualifierComparison itqc = new IncompatibleTypeQualifierComparison(0, 1);
        boolean result = itqc.showBug(0, 1); // TRIGGER BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        assertFalse(result); // Test should fail since 0 and 1 are not equal
    }
}