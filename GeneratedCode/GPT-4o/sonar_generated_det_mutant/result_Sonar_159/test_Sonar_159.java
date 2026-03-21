import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class IteratorBugExampleTest {

    @Test
    public void testShowBug() {
        IteratorBugExample example = new IteratorBugExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // This will trigger the bug because the logic in showBug incorrectly uses hasNext()
        List<Integer> result = example.showBug(numbers); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        
        // The expected behavior would be to return the list as is, 
        // but due to the bug, the result will be incorrect
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result); // The test will fail due to the bug
    }
}