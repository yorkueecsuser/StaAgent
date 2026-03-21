import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBugWithDifferentValues() {
        CompareToBugExample example = new CompareToBugExample();
        assertEquals(-1, example.showBug(5, 10)); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(1, example.showBug(10, 5));  // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(0, example.showBug(5, 5));   // TRIGGER BUG: "compareTo" results should not be checked for specific values
    }
}