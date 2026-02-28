import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test  
    public void testInvariantHoist() {
        Main main = new Main();
        main.invariant_hoist(10);
        assertEquals(15, main.showBug(10));  // TRIGGER BUG: INVARIANT_CALL​
    }
}