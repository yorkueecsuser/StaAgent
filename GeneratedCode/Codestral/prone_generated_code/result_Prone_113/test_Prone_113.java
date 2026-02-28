import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ModifyingCollectionWithItselfTest {
    @Test
    public void testBugTriggers() {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        Collection<Integer> result = buggyProgram.showBug(numbers); // TRIGGER BUG: ModifyingCollectionWithItself
        // The bug is triggered here when we call showBug method with a collection argument.
        // This will cause an infinite loop or duplicate the elements, depending on the type of Collection and implementation class.
        // As a result, the test will fail due to the timeout.
        assertTrue(result.size() > numbers.size()); // This assertion will fail due to the timeout caused by the infinite loop.
    }
}