import org.junit.Test;
import static org.junit.Assert.*;

public class SomeEJBTest {
    @Test
    public void testStaticEJBFieldShouldBeFinalBug() {
        int result = SomeEJB.showBug();
        assertEquals("Expected result to be equal to 10", 10, result);
        // TRIGGER BUG: StaticEJBFieldShouldBeFinal
    }
}