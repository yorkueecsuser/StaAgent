import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBitsBugTest {

    @Test
    public void testShowBug() {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        double result = bugDemo.showBug();   // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
        assertEquals(1.0610049784E-314, result, 0.0); // This assertion will fail, triggering the bug
    }
}