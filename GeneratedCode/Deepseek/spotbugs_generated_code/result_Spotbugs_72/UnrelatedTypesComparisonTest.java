import org.junit.Test;
import static org.junit.Assert.*;

public class UnrelatedTypesComparisonTest {
    @Test
    public void testShowBug() {
        UnrelatedTypesComparison obj = new UnrelatedTypesComparison();
        Object object = new Object();
        String str = "Test";

        // TRIGGER BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        assertFalse(obj.showBug(object, str));
    }
}