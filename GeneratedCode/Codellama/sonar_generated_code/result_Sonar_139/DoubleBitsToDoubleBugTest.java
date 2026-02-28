import org.junit.Test;
import static org.junit.Assert.*;

class DoubleBitsToDoubleBugTest {
    @Test
    public void testDoubleBitsToDouble() {
        int i = 0x80003800;
        Double.longBitsToDouble(i); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    @Test
    public void testShowBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
    }
}