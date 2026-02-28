import org.junit.Test;
import static org.junit.Assert.*;

public class HashcodeBugDemoTest {

    @Test
    public void testShowBugWithPolygenelubricants() {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        int result = demo.showBug("polygenelubricants"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals(Integer.MAX_VALUE, result); // This will fail because Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE
    }

    @Test
    public void testShowBugWithGydZG_() {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        int result = demo.showBug("GydZG_"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals(Integer.MAX_VALUE, result); // This will fail because Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE
    }

    @Test
    public void testShowBugWithDESIGNINGWORKHOUSES() {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        int result = demo.showBug("DESIGNING WORKHOUSES"); // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        assertEquals(Integer.MAX_VALUE, result); // This will fail because Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE
    }
}