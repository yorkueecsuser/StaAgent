import org.junit.Test;
import static org.junit.Assert.*;

public class NullTernaryTest {

    @Test
    // TRIGGER BUG: NullTernary
    public void testBug() {
        Integer foo = null;
        boolean flag = true;
        int x = flag? foo : null;
        assertNotNull(x);
    }
}