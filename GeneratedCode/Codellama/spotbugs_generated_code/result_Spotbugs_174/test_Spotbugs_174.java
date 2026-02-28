import org.junit.Test;
import static org.junit.Assert.*;

class BuggyCodeTest {
    @Test
    public void testGetArray() {
        int[] array = BuggyCode.getArray();
        assertEquals(array.length, 5);
        array[0] = 10;
        // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        assertEquals(BuggyCode.getArray()[0], 1);
    }
}