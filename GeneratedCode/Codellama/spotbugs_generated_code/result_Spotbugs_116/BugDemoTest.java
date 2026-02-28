import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void testBug() {
        int x = 10;
        double y = (double)x;
        System.out.println(Math.ceil(y)); // TRIGGER BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}