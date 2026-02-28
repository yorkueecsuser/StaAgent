import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        assertFalse(main.showBug(negativeValue, nonNegativeValue)); // TRIGGER BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    }
}