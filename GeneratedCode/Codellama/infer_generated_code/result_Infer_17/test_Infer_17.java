import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverL2Test {
    @Test
    public void testShowBug() {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug(); // TRIGGER BUG: INTEGER_OVERFLOW_L2
    }
}