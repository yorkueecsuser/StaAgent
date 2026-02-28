import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CovariantArrayElementStoreBugTest {
    @Test
    public void testBug() {
        // TRIGGER BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        ArrayList<Number> list = new ArrayList<>();
        list.add(1); // This line is the problem
        list.add(2);
        list.add(3);
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
    }
}