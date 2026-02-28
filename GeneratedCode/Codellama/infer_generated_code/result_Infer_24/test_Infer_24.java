import org.junit.Test;
import static org.junit.Assert.*;

public class InvariantHoistTest {
    @Test
    public void testInvariantHoist() {
        InvariantHoist invariantHoist = new InvariantHoist();
        invariantHoist.invariantHoist(5); // TRIGGER BUG: INVARIANT_CALL
    }
}