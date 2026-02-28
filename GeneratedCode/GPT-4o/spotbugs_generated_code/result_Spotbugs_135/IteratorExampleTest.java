import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class IteratorExampleTest {

    @Test
    public void testShowBugWithMultipleElements() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        IteratorExample example = new IteratorExample();
        boolean result = example.showBug(numbers); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        
        assertFalse("The test should fail because the hasNext method advances the iterator improperly.", result);
    }

    @Test
    public void testShowBugWithSingleElement() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        IteratorExample example = new IteratorExample();
        boolean result = example.showBug(numbers); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        
        assertFalse("The test should fail because the hasNext method advances the iterator improperly.", result);
    }

    @Test
    public void testShowBugWithEmptyList() {
        List<Integer> numbers = new ArrayList<>();

        IteratorExample example = new IteratorExample();
        boolean result = example.showBug(numbers); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        
        assertFalse("The test should fail because the hasNext method advances the iterator improperly.", result);
    }
}