import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugTest {
    @Test
    public void testCompareToBug() {
        CompareToBug comparator = new CompareToBug();
        // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(-1, comparator.compare(1, 2));
        assertEquals(0, comparator.compare(1, 1));
        assertEquals(1, comparator.compare(2, 1));
    }
}