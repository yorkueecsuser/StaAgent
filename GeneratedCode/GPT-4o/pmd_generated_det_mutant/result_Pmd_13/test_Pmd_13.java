import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testShowBug() {
        // Creating an instance of Example with a value 5
        Example example = new Example(5); // TRIGGER BUG: AvoidFieldNameMatchingTypeName
        // This will call the showBug method
        int result = example.showBug();
        // The assertion is expected to pass if there is no bug, but it will fail due to the bug
        assertEquals(5, result); // TRIGGER BUG: AvoidFieldNameMatchingTypeName
    }
}