import org.junit.Test;
import static org.junit.Assert.*;

class DeadLocalIncrementTest {
    @Test
    public void testBug() {
        DeadLocalIncrement deadLocalIncrement = new DeadLocalIncrement();
        int x = 1;
        assertEquals(x, deadLocalIncrement.showBug(x));
        x = 2;
        assertEquals(x, deadLocalIncrement.showBug(x));
        // TRIGGER BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        assertEquals(x, deadLocalIncrement.showBug(x++));
    }
}