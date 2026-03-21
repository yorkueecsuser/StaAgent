import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBitsBugTest {
    @Test
    public void testShowBug() {
        DoubleBitsBug bug = new DoubleBitsBug();
        double result = bug.showBug();
        assertEquals(1.0610049784E-314, result); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
    }
}