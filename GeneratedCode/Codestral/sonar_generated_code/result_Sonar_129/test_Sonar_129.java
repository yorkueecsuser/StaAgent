import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugTest {
    @Test
    public void testCompareToBug() {
        CompareToBug obj1 = new CompareToBug(1);
        CompareToBug obj2 = new CompareToBug(2);

        int result = obj1.showBug(obj2); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
        assertTrue(result < 0);
    }
}