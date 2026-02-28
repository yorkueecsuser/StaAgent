import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class PrimitiveArrayAsListBugTest {

    @Test
    public void testShowBug() {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        
        List<int[]> result = example.showBug(numbers); // TRIGGER BUG: ArraysAsListPrimitiveArray
        
        // Expecting a list of boxed Integers but getting a list with a single element (the whole array)
        assertEquals("Expected list size of 5 but got a list size of 1", 5, result.size());
        
        // Fails because the list contains a single int[] element, not Integers
        assertEquals("Expected first element to be 1 but was not", 1, (int) result.get(0)[0]); // TRIGGER BUG: ArraysAsListPrimitiveArray
    }
}