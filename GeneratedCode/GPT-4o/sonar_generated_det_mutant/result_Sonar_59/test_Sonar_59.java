import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBug() {
        CompareToBugExample example = new CompareToBugExample();
        String result = example.showBug();  // TRIGGER BUG: "compareTo" should not be overloaded
        assertEquals("Comparison result: 0", result);
    }
}