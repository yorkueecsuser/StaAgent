import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SimpleExampleTest {
    @Test(expected = ClassCastException.class)
    public void testShowBug() {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug(); // TRIGGER BUG: UseArrayListInsteadOfVector
        assertFalse(result instanceof ArrayList); // Expecting ArrayList but got Vector
    }
}