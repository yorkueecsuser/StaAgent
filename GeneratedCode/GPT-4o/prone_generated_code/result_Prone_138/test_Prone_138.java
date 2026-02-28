import org.junit.Test;
import static org.junit.Assert.*;

public class ProtobufStringComparisonTest {

    @Test
    public void testShowBugWithIdenticalContentStrings() {
        ProtobufStringComparison comparison = new ProtobufStringComparison();
        boolean result = comparison.showBug("John Doe", new String("John Doe")); // TRIGGER BUG: ProtoStringFieldReferenceEquality
        assertFalse("Expected names to be not equal due to reference equality, but they were considered equal", result); // TRIGGER BUG: ProtoStringFieldReferenceEquality
    }

    @Test
    public void testShowBugWithDifferentStrings() {
        ProtobufStringComparison comparison = new ProtobufStringComparison();
        boolean result = comparison.showBug("John Doe", "Jane Doe"); // TRIGGER BUG: ProtoStringFieldReferenceEquality
        assertFalse("Expected names to be not equal, and they were correctly considered not equal", result);
    }
}