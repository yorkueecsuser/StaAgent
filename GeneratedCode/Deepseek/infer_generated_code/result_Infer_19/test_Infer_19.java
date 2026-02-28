import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerOverflowU5Test {

    @Test
    public void testMain() {
        IntegerOverflowU5.main(null);
        // TRIGGER BUG: INTEGER_OVERFLOW_U5
        fail("Expected an ArithmeticException to be thrown");
    }

    @Test
    public void testShowBug() {
        IntegerOverflowU5 instance = new IntegerOverflowU5();
        instance.showBug();
        // TRIGGER BUG: INTEGER_OVERFLOW_U5
        fail("Expected an ArithmeticException to be thrown");
    }
}