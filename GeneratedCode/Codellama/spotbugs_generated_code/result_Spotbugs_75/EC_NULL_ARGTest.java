import org.junit.Test;
import static org.junit.Assert.*;

public class EC_NULL_ARG_Test {
    @Test
    public void testBug() {
        Integer x = null;
        Integer y = 5;
        assertFalse(x.equals(y)); // TRIGGER BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}