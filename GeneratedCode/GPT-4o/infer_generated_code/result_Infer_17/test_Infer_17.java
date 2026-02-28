import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowExampleTest {

    @Test
    public void testShowBug() {
        IntegerOverflowExample example = new IntegerOverflowExample();
        example.showBug(); // TRIGGER BUG: INTEGER_OVERFLOW_L2
    }
}