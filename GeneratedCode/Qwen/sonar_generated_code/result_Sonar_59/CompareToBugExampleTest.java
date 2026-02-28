import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBug() {
        CompareToBugExample example = new CompareToBugExample();
        assertEquals(-1, example.showBug());  // TRIGGER BUG: "compareTo" should not be overloaded
    }
}