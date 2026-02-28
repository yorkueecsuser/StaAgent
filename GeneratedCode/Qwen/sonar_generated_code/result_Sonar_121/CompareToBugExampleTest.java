import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBug() {
        CompareToBugExample example = new CompareToBugExample();
        String result = example.showBug(); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals("First element is less than the second", result); // This will fail if the first element is not less than the second
    }
}