import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main obj = new Main(10);

    @Test
    public void testShowBug() {
        // TRIGGER BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        assertEquals(0, obj.showBug());
    }
}