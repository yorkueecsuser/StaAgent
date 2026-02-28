import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBugTest {
    @Test
    public void testShowBug() {
        DoubleBug bug = new DoubleBug();
        int value = 0x80003800;
        double expectedResult = 1.0610049784E-314;
        double actualResult = bug.showBug(value); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
        assertNotEquals(expectedResult, actualResult);
    }
}