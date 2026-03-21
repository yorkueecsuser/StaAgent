import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        int[] array = {1, 2, 3};
        // TRIGGER BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        Main.showBug(array, 5);
    }
}