import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;

public class UnrelatedInterfaceComparisonTest {

    @Test
    public void testUnrelatedInterfaceComparison() {
        UnrelatedInterfaceComparison example = new UnrelatedInterfaceComparison();
        List<String> list = List.of("a", "b", "c");
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        
        // This will trigger the bug as the showBug method is expected to return false.
        boolean result = example.showBug(list, map); // TRIGGER BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        
        // The test will fail because the result will always be false due to the bug.
        assertTrue("Expected the result to be true, but it was false", result);
    }
}